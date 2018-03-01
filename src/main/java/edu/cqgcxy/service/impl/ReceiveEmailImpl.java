package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.ReceiveEmailMapper;
import edu.cqgcxy.model.ReceiveEmail;
import edu.cqgcxy.model.ReceiveEmailExample;
import edu.cqgcxy.service.ReceiveEmailBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("receiveEmail")
public class ReceiveEmailImpl implements ReceiveEmailBox {
    @Autowired
    private ReceiveEmailMapper receiveEmailMapper;

    /**统计未读邮件
     * @param userPhone userPhone
     * @return 未读邮件个数
     */
    @Override
    public long countUnreadEmail(String userPhone) {
        ReceiveEmailExample receiveEmailExample = new ReceiveEmailExample();
        receiveEmailExample.createCriteria().andUserphoneEqualTo(userPhone).andIsreadEqualTo(0).andIsdelEqualTo(0);
        return receiveEmailMapper.countByExample(receiveEmailExample);
    }

    /**
     * 收件人接收邮件
     *
     * @param receiveEmail 邮件详情:收件人id,发件人id,邮件详情,发送时间,标题
     * @return select返回
     */
    @Override
    public int sendEmail(ReceiveEmail receiveEmail) {
        return receiveEmailMapper.insert(receiveEmail);
    }

    /**
     * 收件箱
     *
     * @param phone 收件人phone
     * @return 信件详情
     */
    @Override
    public List<ReceiveEmail> receiveEmail(String phone) {
        ReceiveEmailExample receiveEmailExample = new ReceiveEmailExample();
        receiveEmailExample.createCriteria().andUserphoneEqualTo(phone).andIsdelEqualTo(0);
        return receiveEmailMapper.selectByExample(receiveEmailExample);
    }

    /**
     * 通过邮件ID查询邮件
     *
     * @param id 邮件ID
     * @return 邮件详情
     */
    @Override
    public ReceiveEmail findByID(int id) {
        return receiveEmailMapper.selectByPrimaryKey(id);
    }

    /** 更新未读状态
     * @param receiveEmail 邮件详情
     * @return int
     */
    @Override
    public int updateReadStatus(ReceiveEmail receiveEmail) {
        ReceiveEmailExample receiveEmailExample = new ReceiveEmailExample();
        receiveEmailExample.createCriteria().andReceiveemailidEqualTo(receiveEmail.getReceiveemailid());
        return receiveEmailMapper.updateByExampleSelective(receiveEmail,receiveEmailExample);
    }

    /**
     * 查找未读邮件
     *
     * @param phone 用户电话
     * @return 邮件列表
     */
    @Override
    public List<ReceiveEmail> findUnReadEmail(String phone) {
        ReceiveEmailExample receiveEmailExample = new ReceiveEmailExample();
        receiveEmailExample.createCriteria().andUserphoneEqualTo(phone).andIsreadEqualTo(0).andIsdelEqualTo(0);
        return receiveEmailMapper.selectByExample(receiveEmailExample);
    }

    /**
     * 查找删除邮件
     *
     * @param phone phone
     * @return 邮件列表
     */
    @Override
    public List<ReceiveEmail> findDeleteEmail(String phone) {
        ReceiveEmailExample receiveEmailExample = new ReceiveEmailExample();
        receiveEmailExample.createCriteria().andUserphoneEqualTo(phone).andIsdelEqualTo(1);
        return receiveEmailMapper.selectByExample(receiveEmailExample);
    }

    /**
     * 彻底删除来信
     *
     * @param id 来信ID
     * @return int
     */
    @Override
    public int deleteReceiveEmail(int id) {


        return receiveEmailMapper.deleteByPrimaryKey(id);
    }

    /**
     * 更新删除状态
     *
     * @param receiveEmail 收信传入del数字和id
     * @return int
     */
    @Override
    public int updateDeleteStatus(ReceiveEmail receiveEmail) {
        ReceiveEmailExample receiveEmailExample = new ReceiveEmailExample();
        receiveEmailExample.createCriteria().andReceiveemailidEqualTo(receiveEmail.getReceiveemailid());
       return receiveEmailMapper.updateByExampleSelective(receiveEmail,receiveEmailExample);
    }
}
