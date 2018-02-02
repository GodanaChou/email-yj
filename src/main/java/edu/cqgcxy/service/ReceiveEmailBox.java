package edu.cqgcxy.service;

import edu.cqgcxy.model.ReceiveEmail;

import java.util.List;

public interface ReceiveEmailBox {

    /** 统计未读邮件
     * @param userPhone 收件人电话
     * @return 未读邮件个数
     */
    long  countUnreadEmail(String userPhone);

    /** 收件人接收邮件
     * @param receiveEmail 邮件详情:收件人id,发件人phone,邮件详情,发送时间,标题
     * @return select返回
     */
    int sendEmail(ReceiveEmail receiveEmail);

    /** 收件箱
     *
     * @param phone 收件人phone
     * @return 信件详情
     */
    List<ReceiveEmail> receiveEmail(String phone);

    /** 通过邮件ID查询邮件
     *
     * @param id 邮件ID
     * @return 邮件详情
     */
    ReceiveEmail findByID(int id);

    /** 更新未读状态
     * @param receiveEmail 邮件详情
     * @return int
     */
    int updateReadStatus(ReceiveEmail receiveEmail);

}
