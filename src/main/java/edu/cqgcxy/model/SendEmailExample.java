package edu.cqgcxy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SendEmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SendEmailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSendemailidIsNull() {
            addCriterion("sendEmailID is null");
            return (Criteria) this;
        }

        public Criteria andSendemailidIsNotNull() {
            addCriterion("sendEmailID is not null");
            return (Criteria) this;
        }

        public Criteria andSendemailidEqualTo(Integer value) {
            addCriterion("sendEmailID =", value, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andSendemailidNotEqualTo(Integer value) {
            addCriterion("sendEmailID <>", value, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andSendemailidGreaterThan(Integer value) {
            addCriterion("sendEmailID >", value, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andSendemailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendEmailID >=", value, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andSendemailidLessThan(Integer value) {
            addCriterion("sendEmailID <", value, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andSendemailidLessThanOrEqualTo(Integer value) {
            addCriterion("sendEmailID <=", value, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andSendemailidIn(List<Integer> values) {
            addCriterion("sendEmailID in", values, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andSendemailidNotIn(List<Integer> values) {
            addCriterion("sendEmailID not in", values, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andSendemailidBetween(Integer value1, Integer value2) {
            addCriterion("sendEmailID between", value1, value2, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andSendemailidNotBetween(Integer value1, Integer value2) {
            addCriterion("sendEmailID not between", value1, value2, "sendemailid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andIssuccessIsNull() {
            addCriterion("isSuccess is null");
            return (Criteria) this;
        }

        public Criteria andIssuccessIsNotNull() {
            addCriterion("isSuccess is not null");
            return (Criteria) this;
        }

        public Criteria andIssuccessEqualTo(Integer value) {
            addCriterion("isSuccess =", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotEqualTo(Integer value) {
            addCriterion("isSuccess <>", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThan(Integer value) {
            addCriterion("isSuccess >", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSuccess >=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThan(Integer value) {
            addCriterion("isSuccess <", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThanOrEqualTo(Integer value) {
            addCriterion("isSuccess <=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessIn(List<Integer> values) {
            addCriterion("isSuccess in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotIn(List<Integer> values) {
            addCriterion("isSuccess not in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessBetween(Integer value1, Integer value2) {
            addCriterion("isSuccess between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("isSuccess not between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Integer value) {
            addCriterion("isDel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Integer value) {
            addCriterion("isDel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Integer value) {
            addCriterion("isDel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Integer value) {
            addCriterion("isDel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("isDel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Integer> values) {
            addCriterion("isDel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Integer> values) {
            addCriterion("isDel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Integer value1, Integer value2) {
            addCriterion("isDel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("isDel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIssaveIsNull() {
            addCriterion("isSave is null");
            return (Criteria) this;
        }

        public Criteria andIssaveIsNotNull() {
            addCriterion("isSave is not null");
            return (Criteria) this;
        }

        public Criteria andIssaveEqualTo(Integer value) {
            addCriterion("isSave =", value, "issave");
            return (Criteria) this;
        }

        public Criteria andIssaveNotEqualTo(Integer value) {
            addCriterion("isSave <>", value, "issave");
            return (Criteria) this;
        }

        public Criteria andIssaveGreaterThan(Integer value) {
            addCriterion("isSave >", value, "issave");
            return (Criteria) this;
        }

        public Criteria andIssaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSave >=", value, "issave");
            return (Criteria) this;
        }

        public Criteria andIssaveLessThan(Integer value) {
            addCriterion("isSave <", value, "issave");
            return (Criteria) this;
        }

        public Criteria andIssaveLessThanOrEqualTo(Integer value) {
            addCriterion("isSave <=", value, "issave");
            return (Criteria) this;
        }

        public Criteria andIssaveIn(List<Integer> values) {
            addCriterion("isSave in", values, "issave");
            return (Criteria) this;
        }

        public Criteria andIssaveNotIn(List<Integer> values) {
            addCriterion("isSave not in", values, "issave");
            return (Criteria) this;
        }

        public Criteria andIssaveBetween(Integer value1, Integer value2) {
            addCriterion("isSave between", value1, value2, "issave");
            return (Criteria) this;
        }

        public Criteria andIssaveNotBetween(Integer value1, Integer value2) {
            addCriterion("isSave not between", value1, value2, "issave");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendTime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andReceivepersonIsNull() {
            addCriterion("receivePerson is null");
            return (Criteria) this;
        }

        public Criteria andReceivepersonIsNotNull() {
            addCriterion("receivePerson is not null");
            return (Criteria) this;
        }

        public Criteria andReceivepersonEqualTo(String value) {
            addCriterion("receivePerson =", value, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonNotEqualTo(String value) {
            addCriterion("receivePerson <>", value, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonGreaterThan(String value) {
            addCriterion("receivePerson >", value, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonGreaterThanOrEqualTo(String value) {
            addCriterion("receivePerson >=", value, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonLessThan(String value) {
            addCriterion("receivePerson <", value, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonLessThanOrEqualTo(String value) {
            addCriterion("receivePerson <=", value, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonLike(String value) {
            addCriterion("receivePerson like", value, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonNotLike(String value) {
            addCriterion("receivePerson not like", value, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonIn(List<String> values) {
            addCriterion("receivePerson in", values, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonNotIn(List<String> values) {
            addCriterion("receivePerson not in", values, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonBetween(String value1, String value2) {
            addCriterion("receivePerson between", value1, value2, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andReceivepersonNotBetween(String value1, String value2) {
            addCriterion("receivePerson not between", value1, value2, "receiveperson");
            return (Criteria) this;
        }

        public Criteria andAnnexsignIsNull() {
            addCriterion("annexSign is null");
            return (Criteria) this;
        }

        public Criteria andAnnexsignIsNotNull() {
            addCriterion("annexSign is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexsignEqualTo(String value) {
            addCriterion("annexSign =", value, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignNotEqualTo(String value) {
            addCriterion("annexSign <>", value, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignGreaterThan(String value) {
            addCriterion("annexSign >", value, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignGreaterThanOrEqualTo(String value) {
            addCriterion("annexSign >=", value, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignLessThan(String value) {
            addCriterion("annexSign <", value, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignLessThanOrEqualTo(String value) {
            addCriterion("annexSign <=", value, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignLike(String value) {
            addCriterion("annexSign like", value, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignNotLike(String value) {
            addCriterion("annexSign not like", value, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignIn(List<String> values) {
            addCriterion("annexSign in", values, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignNotIn(List<String> values) {
            addCriterion("annexSign not in", values, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignBetween(String value1, String value2) {
            addCriterion("annexSign between", value1, value2, "annexsign");
            return (Criteria) this;
        }

        public Criteria andAnnexsignNotBetween(String value1, String value2) {
            addCriterion("annexSign not between", value1, value2, "annexsign");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}