package edu.cqgcxy.service;

import edu.cqgcxy.model.SendEmail;
import edu.cqgcxy.model.SendEmailExample;

import java.util.List;

public interface SendEmailBox {

    /**
     * 通过发件人ID查询邮件详情
     * @param sendEmail 邮件属性
     * @return 邮件详细信息
     */
    List<SendEmail> findByPrimaryKeySelective(SendEmailExample sendEmail);

    /**
     * 更新邮箱信息
     * @param sendEmail 邮件详情
     * @return 整数 1 代表更新成功,2更新失败
     */
    int updateEmail(SendEmail sendEmail);

    /**
     * 彻底删除邮件
     * @param id 邮件ID
     * @return 1 删除成功 2 删除失败
     */
    int deleteEmail(int id);

    /**
     * 新建邮件
     * @param sendEmail 邮件详情
     * @return 1 保存或发生成功 2保存或发生失败
     */
    int insertEmail(SendEmail sendEmail);

    /**
     * 计数
     * @param sendEmail 邮件属性
     * @return 特定类型邮件数量
     */
    long countEmail(SendEmailExample sendEmail);
}
