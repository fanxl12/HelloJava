package com.fanxl.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author fanxl12
 * @description
 * @date 2020/1/18 16:29
 */
public class Test {

    public static String getSql(Person person) throws Exception {
        StringBuilder sb = new StringBuilder();
        Class p = person.getClass();
        boolean hasTable = p.isAnnotationPresent(Table.class);
        if (!hasTable) {
            return null;
        }
        Table table = (Table) p.getAnnotation(Table.class);
        String tableName = table.value();
        sb.append("insert into ").append("t_").append(tableName).append(" (");
        Field[] fields = p.getDeclaredFields();
        StringBuilder valueSb = new StringBuilder("(");
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            boolean hasColumn = field.isAnnotationPresent(Column.class);
            if (!hasColumn) {
                continue;
            }
            Column column = field.getAnnotation(Column.class);
            sb.append(column.value());
            valueSb.append(getFieldValueByField(field, person));
            if (i == fields.length-1) {
                sb.append(")");
                valueSb.append(")");
            } else {
                sb.append(", ");
                valueSb.append(", ");
            }
        }
        sb.append(" values ").append(valueSb).append(";");
        return sb.toString();
    }

    /**
     * 通过field来获取值
     * @param field
     * @param obj
     * @return
     * @throws IllegalAccessException
     */
    private static Object getFieldValueByField(Field field, Object obj) throws IllegalAccessException {
        field.setAccessible(true);
        return field.get(obj);
    }

    private static Object getFieldValueByMethod(Field field, Class cls, Object obj) throws Exception {
        String fieldName = field.getName();
        String upperChar = fieldName.substring(0, 1).toUpperCase();
        String anotherStr = fieldName.substring(1);
        String methodName = "get" + upperChar + anotherStr;
        Method method = cls.getMethod(methodName, new Class[]{});
        method.setAccessible(true);
        return method.invoke(obj, new Object[]{});
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(20);
        try {
            System.out.println(getSql(person));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
