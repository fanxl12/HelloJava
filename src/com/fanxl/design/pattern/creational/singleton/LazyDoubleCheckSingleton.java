package com.fanxl.design.pattern.creational.singleton;

/**
 * @description 双重检查 并且禁止创建对象重排序
 * @author: fanxl
 * @date: 2019/2/16 0016 16:08
 */
public class LazyDoubleCheckSingleton {

    /**
     * volatile关键字解决java程序创建对象时候重排序问题，使在创建对象的时候不会进行重排序
     * 加了这个关键字之后，多线程情况下CPU会有共享内存，所有线程都会看到共享内存的最新状态
     * 保障了内存的可见性，volatile修饰的共享变量在进行写操作的时候会多出一些汇编代码，
     * 起到两个作用，第一 将当前处理器缓存行的数据写回到内存，这个写回内存的操作会使得其他CPU缓存
     * 的该内存地址的数据无效，因为其他CPU缓存的数据无效，它又会从共享内存中读取数据，这样就保持了
     * 内存的可见性，这里主要使用了缓存一致性协议
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //19行这里会进行三个操作
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 但是 2 和 3 可能会被重排序，先执行3  再执行2
                    // intra-thread semantics 保证重排序不会改变单线程的执行结果， 所以2和3是允许的
                    // 重排序可以提高程序的执行性能
                    //4.初次访问对象
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
