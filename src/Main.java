
public class Main {

    public static void main(String[] args) throws Exception {
        String fileName = "123";
        int index = fileName.lastIndexOf(".");
        if (index == -1) {
            throw new Exception("文件名称无后缀信息");
        }
        String fileSuffix = fileName.substring(index+1);
        if (fileSuffix == null || fileSuffix.length() == 0) {
            throw new Exception("文件名称无后缀信息");
        }
        System.out.println("fileSuffix:" + fileSuffix);
        System.out.println("fileName:" + fileName.substring(0, index));
        String url = "http://192.168.50.60:8072/guide";
        System.out.println(url.substring(0, url.lastIndexOf(":")));
    }
}
