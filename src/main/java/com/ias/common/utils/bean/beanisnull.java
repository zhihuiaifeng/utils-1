package com.ias.common.utils.bean;

import java.util.Optional;

public class beanisnull {

    public static void main(String[] args) {
//        如果new对象就不是空了
        Message message = new Message();
        Message m2=null;
        Optional<Message> message1 = Optional.ofNullable(message);
        Optional<Message> m21 = Optional.ofNullable(m2);
//        如果对象不为空，打印值不存在，ispresent判断是否为空。
        if (message1.isPresent()){
            System.out.println("值不存在");
        }
        if (m21.isPresent()){
            System.out.println("肯定打印不出值");
        }
//        如果对象中的name不是空，message.getName()不是空，则返回对象中的值，如果返回的是空则返回括号里面的值
        String xiaoxiao = Optional.ofNullable(message.getName()).orElse("xiaoxiao");
        System.out.println(xiaoxiao);
//        Message message2 = new Message(1, "xx", "haha");
        Message message2 = Optional.ofNullable(message).orElseGet(() -> {
            return new Message(1, "xx", "haha");
        });
        System.out.println(message2.toString());
//        这个是为空的
        Message message3 = Optional.ofNullable(m2).orElseGet(() -> {
            return new Message(1, "xx", "haha");
        });
        System.out.println(message3);

    }
}
