package edu.cqgcxy.service;

import edu.cqgcxy.model.Report;

import java.util.List;

public interface ReportService {

    /**
     * @return List
     */
    List<Report> findReport();

    int insert(Report report);

    Report findByUserIDAndReEmlID(int id,int emailID);

    int countNum();


    /**查询是否已经举报过某用户
     * @param userID 举报用户ID
     * @param phone 被举报用户phone
     * @return  1 举报过 0 没举报
     */

    int findByUserID(int userID,String phone);
}
