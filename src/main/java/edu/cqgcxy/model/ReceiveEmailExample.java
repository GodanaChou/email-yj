package edu.cqgcxy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiveEmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiveEmailExample() {
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

        public Criteria andReceiveemailidIsNull() {
            addCriterion("receiveEmailID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidIsNotNull() {
            addCriterion("receiveEmailID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidEqualTo(Integer value) {
            addCriterion("receiveEmailID =", value, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidNotEqualTo(Integer value) {
            addCriterion("receiveEmailID <>", value, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidGreaterThan(Integer value) {
            addCriterion("receiveEmailID >", value, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiveEmailID >=", value, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidLessThan(Integer value) {
            addCriterion("receiveEmailID <", value, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidLessThanOrEqualTo(Integer value) {
            addCriterion("receiveEmailID <=", value, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidIn(List<Integer> values) {
            addCriterion("receiveEmailID in", values, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidNotIn(List<Integer> values) {
            addCriterion("receiveEmailID not in", values, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidBetween(Integer value1, Integer value2) {
            addCriterion("receiveEmailID between", value1, value2, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andReceiveemailidNotBetween(Integer value1, Integer value2) {
            addCriterion("receiveEmailID not between", value1, value2, "receiveemailid");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNull() {
            addCriterion("sendPhone is null");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNotNull() {
            addCriterion("sendPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSendphoneEqualTo(String value) {
            addCriterion("sendPhone =", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotEqualTo(String value) {
            addCriterion("sendPhone <>", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThan(String value) {
            addCriterion("sendPhone >", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sendPhone >=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThan(String value) {
            addCriterion("sendPhone <", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThanOrEqualTo(String value) {
            addCriterion("sendPhone <=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLike(String value) {
            addCriterion("sendPhone like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotLike(String value) {
            addCriterion("sendPhone not like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneIn(List<String> values) {
            addCriterion("sendPhone in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotIn(List<String> values) {
            addCriterion("sendPhone not in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneBetween(String value1, String value2) {
            addCriterion("sendPhone between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotBetween(String value1, String value2) {
            addCriterion("sendPhone not between", value1, value2, "sendphone");
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

        public Criteria andIsreadIsNull() {
            addCriterion("isRead is null");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNotNull() {
            addCriterion("isRead is not null");
            return (Criteria) this;
        }

        public Criteria andIsreadEqualTo(Integer value) {
            addCriterion("isRead =", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotEqualTo(Integer value) {
            addCriterion("isRead <>", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThan(Integer value) {
            addCriterion("isRead >", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("isRead >=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThan(Integer value) {
            addCriterion("isRead <", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThanOrEqualTo(Integer value) {
            addCriterion("isRead <=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadIn(List<Integer> values) {
            addCriterion("isRead in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotIn(List<Integer> values) {
            addCriterion("isRead not in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadBetween(Integer value1, Integer value2) {
            addCriterion("isRead between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotBetween(Integer value1, Integer value2) {
            addCriterion("isRead not between", value1, value2, "isread");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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