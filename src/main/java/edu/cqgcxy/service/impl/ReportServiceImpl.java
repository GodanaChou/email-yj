package edu.cqgcxy.service.impl;

import edu.cqgcxy.mapper.ReportMapper;
import edu.cqgcxy.model.Report;
import edu.cqgcxy.model.ReportExample;
import edu.cqgcxy.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("reportService")
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportMapper reportMapper;


    /**
     *
     *
     * @return List
     */
    @Override
    public List<Report> findReport() {
        ReportExample reportExample = new ReportExample();
        reportExample.createCriteria().andIdIsNotNull();
        return reportMapper.selectByExample(reportExample);
    }

    @Override
    public int insert(Report report) {
        return reportMapper.insert(report);
    }

    @Override
    public Report findByUserIDAndReEmlID(int id, int emailID) {
        ReportExample reportExample = new ReportExample();
        reportExample.createCriteria().andUseridEqualTo(id).andReportemailidEqualTo(emailID);
        if (reportMapper.selectByExample(reportExample).size()>=1){
            return reportMapper.selectByExample(reportExample).get(0);
        }else return null;
    }

    //未用逻辑错误
    @Override
    public int countNum() {
        return reportMapper.countNum();
    }

    /**
     * 查询是否已经举报过某用户
     *
     * @param userID 举报用户ID
     * @param phone  被举报用户phone
     * @return 1 举报过 0 没举报
     */
    @Override
    public int findByUserID(int userID, String phone) {
        ReportExample reportExample = new ReportExample();
        reportExample.createCriteria().andReportphoneEqualTo(phone).andUseridEqualTo(userID);
        List<Report> reports=reportMapper.selectByExample(reportExample);
        if (reports.size()>0){
            return 1;
        }else  return 0;

    }


}
