package com.fanxl.design.pattern.creational.simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/29 0029 11:49
 */
public class VideoFactory {

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) c.getDeclaredConstructor(null).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo1(String type) {
        if (type.equalsIgnoreCase("java")) {
            return new JavaVideo();
        } else if (type.equalsIgnoreCase("python")) {
            return new PythonVideo();
        }
        return null;
    }


}
