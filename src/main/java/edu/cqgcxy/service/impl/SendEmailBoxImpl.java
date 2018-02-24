package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.SendEmailMapper;
import edu.cqgcxy.model.SendEmail;
import edu.cqgcxy.model.SendEmailExample;
import edu.cqgcxy.service.SendEmailBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sendEmailBox")
public class SendEmailBoxImpl implements SendEmailBox {
    @Autowired
    SendEmailMapper sendEmailMapper;


    /**
     * 通过发件人ID查询发送邮件
     *
     * @param userID userID
     * @return 邮件详细信息
     */
    @Override
    public List<SendEmail> findSendEmailByUserID(int userID) {
        SendEmailExample sendEmailExample = new SendEmailExample();
        sendEmailExample.createCriteria().andUseridEqualTo(userID).andIsdelEqualTo(0);
        return sendEmailMapper.selectByExample(sendEmailExample);
    }

    /**
     * 更新邮箱信息
     *
     * @param sendEmail 邮件详情
     * @return 整数 1 代表更新成功,2更新失败
     */
    @Override
    public int updateEmail(SendEmail sendEmail) {
          return sendEmailMapper.updateByPrimaryKeySelective(sendEmail);

    }

    /**
     * 彻底删除邮件
     *
     * @param id 邮件ID
     * @return 1 删除成功 2 删除失败
     */
    @Override
    public int deleteEmail(int id) {
        return sendEmailMapper.deleteByPrimaryKey(id);
    }

    /**
     * 新建邮件
     *
     * @param sendEmail 邮件详情
     * @return 1 保存或发生成功 2保存或发生失败
     */
    @Override
    public int insertEmail(SendEmail sendEmail) {
          return   sendEmailMapper.insertSelective(sendEmail);
    }

    /**
     * 计数
     *
     * @param userID userID
     * @return 发送邮件数量
     */
    @Override
    public long countEmail(int userID) {
        SendEmailExample sendEmailExample = new SendEmailExample();
        sendEmailExample.createCriteria().andUseridEqualTo(userID).andIsdelEqualTo(0);
        return sendEmailMapper.countByExample(sendEmailExample);
    }

    /**
     * 通过邮件ID查询邮件
     *
     * @param emailID 邮件ID
     * @return 邮件详情
     */
    @Override
    public SendEmail findByEmailID(int emailID) {
        return sendEmailMapper.selectByPrimaryKey(emailID);
    }

    /**
     * 通过UserID查找草稿箱
     *
     * @param userID userID
     * @return 邮件详情
     */
    @Override
    public List<SendEmail> findDraft(int userID) {
        SendEmailExample sendEmailExample = new SendEmailExample();
        sendEmailExample.createCriteria().andUseridEqualTo(userID).andIssaveEqualTo(1).andIsdelEqualTo(0);
        return sendEmailMapper.selectByExample(sendEmailExample);
    }

    /**
     * 通过UserID查找删除邮件
     *
     * @param userID userID
     * @return 邮件列表
     */
    @Override
    public List<SendEmail> findDelete(int userID) {
        SendEmailExample sendEmailExample = new SendEmailExample();
        sendEmailExample.createCriteria().andUseridEqualTo(userID).andIsdelEqualTo(1);
        return sendEmailMapper.selectByExample(sendEmailExample);
    }


}
