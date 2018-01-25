package edu.cqgcxy.model;

import java.util.ArrayList;
import java.util.List;

public class UserFriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFriendExample() {
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

        public Criteria andUserfriendidIsNull() {
            addCriterion("userFriendID is null");
            return (Criteria) this;
        }

        public Criteria andUserfriendidIsNotNull() {
            addCriterion("userFriendID is not null");
            return (Criteria) this;
        }

        public Criteria andUserfriendidEqualTo(Integer value) {
            addCriterion("userFriendID =", value, "userfriendid");
            return (Criteria) this;
        }

        public Criteria andUserfriendidNotEqualTo(Integer value) {
            addCriterion("userFriendID <>", value, "userfriendid");
            return (Criteria) this;
        }

        public Criteria andUserfriendidGreaterThan(Integer value) {
            addCriterion("userFriendID >", value, "userfriendid");
            return (Criteria) this;
        }

        public Criteria andUserfriendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userFriendID >=", value, "userfriendid");
            return (Criteria) this;
        }

        public Criteria andUserfriendidLessThan(Integer value) {
            addCriterion("userFriendID <", value, "userfriendid");
            return (Criteria) this;
        }

        public Criteria andUserfriendidLessThanOrEqualTo(Integer value) {
            addCriterion("userFriendID <=", value, "userfriendid");
            return (Criteria) this;
        }

        public Criteria andUserfriendidIn(List<Integer> values) {
            addCriterion("userFriendID in", values, "userfriendid");
            return (Criteria) this;
        }

        public Criteria andUserfriendidNotIn(List<Integer> values) {
            addCriterion("userFriendID not in", values, "userfriendid");
            return (Criteria) this;
        }

        public Criteria andUserfriendidBetween(Integer value1, Integer value2) {
            addCriterion("userFriendID between", value1, value2, "userfriendid");
            return (Criteria) this;
        }

        public Criteria andUserfriendidNotBetween(Integer value1, Integer value2) {
            addCriterion("userFriendID not between", value1, value2, "userfriendid");
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

        public Criteria andFriendphoneIsNull() {
            addCriterion("friendPhone is null");
            return (Criteria) this;
        }

        public Criteria andFriendphoneIsNotNull() {
            addCriterion("friendPhone is not null");
            return (Criteria) this;
        }

        public Criteria andFriendphoneEqualTo(String value) {
            addCriterion("friendPhone =", value, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneNotEqualTo(String value) {
            addCriterion("friendPhone <>", value, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneGreaterThan(String value) {
            addCriterion("friendPhone >", value, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneGreaterThanOrEqualTo(String value) {
            addCriterion("friendPhone >=", value, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneLessThan(String value) {
            addCriterion("friendPhone <", value, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneLessThanOrEqualTo(String value) {
            addCriterion("friendPhone <=", value, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneLike(String value) {
            addCriterion("friendPhone like", value, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneNotLike(String value) {
            addCriterion("friendPhone not like", value, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneIn(List<String> values) {
            addCriterion("friendPhone in", values, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneNotIn(List<String> values) {
            addCriterion("friendPhone not in", values, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneBetween(String value1, String value2) {
            addCriterion("friendPhone between", value1, value2, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendphoneNotBetween(String value1, String value2) {
            addCriterion("friendPhone not between", value1, value2, "friendphone");
            return (Criteria) this;
        }

        public Criteria andFriendnameIsNull() {
            addCriterion("friendName is null");
            return (Criteria) this;
        }

        public Criteria andFriendnameIsNotNull() {
            addCriterion("friendName is not null");
            return (Criteria) this;
        }

        public Criteria andFriendnameEqualTo(String value) {
            addCriterion("friendName =", value, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameNotEqualTo(String value) {
            addCriterion("friendName <>", value, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameGreaterThan(String value) {
            addCriterion("friendName >", value, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameGreaterThanOrEqualTo(String value) {
            addCriterion("friendName >=", value, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameLessThan(String value) {
            addCriterion("friendName <", value, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameLessThanOrEqualTo(String value) {
            addCriterion("friendName <=", value, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameLike(String value) {
            addCriterion("friendName like", value, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameNotLike(String value) {
            addCriterion("friendName not like", value, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameIn(List<String> values) {
            addCriterion("friendName in", values, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameNotIn(List<String> values) {
            addCriterion("friendName not in", values, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameBetween(String value1, String value2) {
            addCriterion("friendName between", value1, value2, "friendname");
            return (Criteria) this;
        }

        public Criteria andFriendnameNotBetween(String value1, String value2) {
            addCriterion("friendName not between", value1, value2, "friendname");
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