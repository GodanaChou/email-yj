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
     * 通过发件人ID查询邮件详情
     *
     * @param sendEmail 邮件属性
     * @return 邮件详细信息
     */
    @Override
    public List<SendEmail> findByPrimaryKeySelective(SendEmailExample sendEmail) {
        return sendEmailMapper.selectByExample(sendEmail);
    }

    /**
     * 更新邮箱信息
     *
     * @param sendEmail 邮件详情
     * @return 整数 1 代表更新成功,2更新失败
     */
    @Override
    public int updateEmail(SendEmail sendEmail) {
        try {
            sendEmailMapper.updateByPrimaryKeySelective(sendEmail);
            return 1;
        }catch (Exception e){
            return 2;
        }
    }

    /**
     * 彻底删除邮件
     *
     * @param id 邮件ID
     * @return 1 删除成功 2 删除失败
     */
    @Override
    public int deleteEmail(int id) {
        try {
            sendEmailMapper.deleteByPrimaryKey(id);
            return 1;
        }catch (Exception e){
            return 2;
        }
    }

    /**
     * 新建邮件
     *
     * @param sendEmail 邮件详情
     * @return 1 保存或发生成功 2保存或发生失败
     */
    @Override
    public int insertEmail(SendEmail sendEmail) {
        try {
            sendEmailMapper.insertSelective(sendEmail);
            return 1;
        }catch (Exception e){
            return 2;
        }

    }

    /**
     * 计数
     *
     * @param sendEmail 邮件属性
     * @return 特定类型邮件数量
     */
    @Override
    public long countEmail(SendEmailExample sendEmail) {
        return sendEmailMapper.countByExample(sendEmail);
    }


}
