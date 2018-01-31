package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.ReceiveEmailMapper;
import edu.cqgcxy.model.ReceiveEmail;
import edu.cqgcxy.model.ReceiveEmailExample;
import edu.cqgcxy.service.ReceiveEmailBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("receiveEmail")
public class ReceiveEmailImpl implements ReceiveEmailBox {
    @Autowired
    private ReceiveEmailMapper receiveEmailMapper;

    /**统计未读邮件
     * @param userID userID
     * @return 未读邮件个数
     */
    @Override
    public long countUnreadEmail(int userID) {
        ReceiveEmailExample receiveEmailExample = new ReceiveEmailExample();
        receiveEmailExample.createCriteria().andUseridEqualTo(userID).andIsreadEqualTo(0);
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
}
