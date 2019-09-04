package com.eva.evaTest.adapter.defaultAdapter;


import com.eva.evaTest.adapter.defaultAdapter.impl.Bonze;

/**
 * @author 方银剑
 * @Title: 缺省适配器
 * @ProjectName YfTest
 * @Description: 天星
 *
 * 缺省适配(Default Adapter)模式为一个接口提供缺省实现，这样子类型可以从这个缺省实现进行扩展，而不必从原有接口进行扩展。作为适配器模式的一个特例，缺省是适配模式在JAVA语言中有着特殊的应用。
 *
 * 　和尚要做什么呢？吃斋、念经、打坐、撞钟、习武等。如果设计一个和尚接口，给出所有的和尚都需要实现的方法，那么这个接口应当如下：
 *
 * 显然，所有的和尚类都应当实现接口所定义的全部方法，不然就根本通不过JAVA语言编辑器。像下面的鲁智深类就不行。
 *
 * 由于鲁智深只实现了getName()和习武()方法，而没有实现任何其他的方法。因此，它根本就通不过Java语言编译器。鲁智深类只有实现和尚接口的所有的方法才可以通过Java语言编译器，但是这样一来鲁智深就不再是鲁智深了。以史为鉴，可以知天下。研究一下几百年前鲁智深是怎么剃度成和尚的，会对Java编程有很大的启发。不错，当初鲁达剃度，众僧说：“此人形容丑恶、相貌凶顽，不可剃度他",但是长老却说：”此人上应天星、心地刚直。虽然时下凶顽，命中驳杂，久后却得清净。证果非凡，汝等皆不及他。”
 *
 * 　　原来如此！看来只要这里也应上一个天星的话，问题就解决了！使用面向对象的语言来说，“应”者，实现也；“天星”者，抽象类也。
 *
 * 鲁智深类继承抽象类“天星”
 * 这个抽象的天星类便是一个适配器类，鲁智深实际上借助于适配器模式达到了剃度的目的。此适配器类实现了和尚接口所要求的所有方法。但是与通常的适配器模式不同的是，此适配器类给出的所有的方法的实现都是“平庸”的。这种“平庸化”的适配器模式称作缺省适配模式。
 *
 * 　　在很多情况下，必须让一个具体类实现某一个接口，但是这个类又用不到接口所规定的所有的方法。通常的处理方法是，这个具体类要实现所有的方法，那些有用的方法要有实现，那些没有用的方法也要有空的、平庸的实现。
 *
 * 　　这些空的方法是一种浪费，有时也是一种混乱。除非看过这些空方法的代码，程序员可能会以为这些方法不是空的。即便他知道其中有一些方法是空的，也不一定知道哪些方法是空的，哪些方法不是空的，除非看过这些方法的源代码或是文档。
 *
 * 　　缺省适配模式可以很好的处理这一情况。可以设计一个抽象的适配器类实现接口，此抽象类要给接口所要求的每一种方法都提供一个空的方法。就像帮助了鲁智深的“上应天星”一样，此抽象类可以使它的具体子类免于被迫实现空的方法。
 *
 * 缺省适配模式的结构
 * 　　缺省适配模式是一种“平庸”化的适配器模式。
 *
 * 　适配器模式的用意是要改变源的接口，以便于目标接口相容。缺省适配的用意稍有不同，它是为了方便建立一个不平庸的适配器类而提供的一种平庸实现。
 *
 * 　　在任何时候，如果不准备实现一个接口的所有方法时，就可以使用“缺省适配模式”制造一个抽象类，给出所有方法的平庸的具体实现。这样，从这个抽象类再继承下去的子类就不必实现所有的方法了。
 *
 * @date 2019/9/321:20
 */
public abstract class Star implements Bonze {
    @Override
    public void vegetarian() {

    }

    @Override
    public void scriptures() {

    }

    @Override
    public void meditation() {

    }

    @Override
    public void gongfu() {

    }

    @Override
    public String getName() {
        return null;
    }
}
