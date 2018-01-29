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

    @Override
    public long countUnreadEmail(int userID) {
        ReceiveEmailExample receiveEmailExample = new ReceiveEmailExample();
        receiveEmailExample.createCriteria().andUseridEqualTo(userID).andIsreadEqualTo(0);
        return receiveEmailMapper.countByExample(receiveEmailExample);
    }
}
