package com.java.Mocking;

public class UserService {

    private UserDao dao;
    public UserService() {
        // TODO Auto-generated constructor stub
    }
    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public String getNameByUserId(Integer id) {
        String name = dao.findNameById(id);
        return name;
    }

    public String getEmailByUserId(Integer id) {
        return dao.findEmailById(id);
    }

    public void doProcess() {
        System.out.println("doProcess() method started");
        pushMsgToKafkaTopic("msg");
        System.out.println("doProcess() method ended");
    }

    public void pushMsgToKafkaTopic(String msg) {
        System.out.println("msg pushing to kafka......");
    }

    public String doWork(String msg) {
        String formattedMsg = formatMsg(msg);
        return formattedMsg;
    }

    private String formatMsg(String msg) {
        return msg.toUpperCase();
    }

}

