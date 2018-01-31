package edu.cqgcxy.service;

import edu.cqgcxy.model.ReceiveEmail;

public interface ReceiveEmailBox {

    /** 统计未读邮件
     * @param userID userID
     * @return 未读邮件个数
     */
    long  countUnreadEmail(int userID);

    /** 收件人接收邮件
     * @param receiveEmail 邮件详情:收件人id,发件人id,邮件详情,发送时间,标题
     * @return select返回
     */
    int sendEmail(ReceiveEmail receiveEmail);

}
