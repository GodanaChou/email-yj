package edu.cqgcxy.model;

import java.util.ArrayList;
import java.util.List;

public class AnnexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnexExample() {
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

        public Criteria andAnnexidIsNull() {
            addCriterion("annexID is null");
            return (Criteria) this;
        }

        public Criteria andAnnexidIsNotNull() {
            addCriterion("annexID is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexidEqualTo(Integer value) {
            addCriterion("annexID =", value, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexidNotEqualTo(Integer value) {
            addCriterion("annexID <>", value, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexidGreaterThan(Integer value) {
            addCriterion("annexID >", value, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexidGreaterThanOrEqualTo(Integer value) {
            addCriterion("annexID >=", value, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexidLessThan(Integer value) {
            addCriterion("annexID <", value, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexidLessThanOrEqualTo(Integer value) {
            addCriterion("annexID <=", value, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexidIn(List<Integer> values) {
            addCriterion("annexID in", values, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexidNotIn(List<Integer> values) {
            addCriterion("annexID not in", values, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexidBetween(Integer value1, Integer value2) {
            addCriterion("annexID between", value1, value2, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexidNotBetween(Integer value1, Integer value2) {
            addCriterion("annexID not between", value1, value2, "annexid");
            return (Criteria) this;
        }

        public Criteria andAnnexnameIsNull() {
            addCriterion("annexName is null");
            return (Criteria) this;
        }

        public Criteria andAnnexnameIsNotNull() {
            addCriterion("annexName is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexnameEqualTo(String value) {
            addCriterion("annexName =", value, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameNotEqualTo(String value) {
            addCriterion("annexName <>", value, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameGreaterThan(String value) {
            addCriterion("annexName >", value, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameGreaterThanOrEqualTo(String value) {
            addCriterion("annexName >=", value, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameLessThan(String value) {
            addCriterion("annexName <", value, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameLessThanOrEqualTo(String value) {
            addCriterion("annexName <=", value, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameLike(String value) {
            addCriterion("annexName like", value, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameNotLike(String value) {
            addCriterion("annexName not like", value, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameIn(List<String> values) {
            addCriterion("annexName in", values, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameNotIn(List<String> values) {
            addCriterion("annexName not in", values, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameBetween(String value1, String value2) {
            addCriterion("annexName between", value1, value2, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexnameNotBetween(String value1, String value2) {
            addCriterion("annexName not between", value1, value2, "annexname");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrIsNull() {
            addCriterion("annexAddr is null");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrIsNotNull() {
            addCriterion("annexAddr is not null");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrEqualTo(String value) {
            addCriterion("annexAddr =", value, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrNotEqualTo(String value) {
            addCriterion("annexAddr <>", value, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrGreaterThan(String value) {
            addCriterion("annexAddr >", value, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrGreaterThanOrEqualTo(String value) {
            addCriterion("annexAddr >=", value, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrLessThan(String value) {
            addCriterion("annexAddr <", value, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrLessThanOrEqualTo(String value) {
            addCriterion("annexAddr <=", value, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrLike(String value) {
            addCriterion("annexAddr like", value, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrNotLike(String value) {
            addCriterion("annexAddr not like", value, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrIn(List<String> values) {
            addCriterion("annexAddr in", values, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrNotIn(List<String> values) {
            addCriterion("annexAddr not in", values, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrBetween(String value1, String value2) {
            addCriterion("annexAddr between", value1, value2, "annexaddr");
            return (Criteria) this;
        }

        public Criteria andAnnexaddrNotBetween(String value1, String value2) {
            addCriterion("annexAddr not between", value1, value2, "annexaddr");
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

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andBigIsNull() {
            addCriterion("big is null");
            return (Criteria) this;
        }

        public Criteria andBigIsNotNull() {
            addCriterion("big is not null");
            return (Criteria) this;
        }

        public Criteria andBigEqualTo(String value) {
            addCriterion("big =", value, "big");
            return (Criteria) this;
        }

        public Criteria andBigNotEqualTo(String value) {
            addCriterion("big <>", value, "big");
            return (Criteria) this;
        }

        public Criteria andBigGreaterThan(String value) {
            addCriterion("big >", value, "big");
            return (Criteria) this;
        }

        public Criteria andBigGreaterThanOrEqualTo(String value) {
            addCriterion("big >=", value, "big");
            return (Criteria) this;
        }

        public Criteria andBigLessThan(String value) {
            addCriterion("big <", value, "big");
            return (Criteria) this;
        }

        public Criteria andBigLessThanOrEqualTo(String value) {
            addCriterion("big <=", value, "big");
            return (Criteria) this;
        }

        public Criteria andBigLike(String value) {
            addCriterion("big like", value, "big");
            return (Criteria) this;
        }

        public Criteria andBigNotLike(String value) {
            addCriterion("big not like", value, "big");
            return (Criteria) this;
        }

        public Criteria andBigIn(List<String> values) {
            addCriterion("big in", values, "big");
            return (Criteria) this;
        }

        public Criteria andBigNotIn(List<String> values) {
            addCriterion("big not in", values, "big");
            return (Criteria) this;
        }

        public Criteria andBigBetween(String value1, String value2) {
            addCriterion("big between", value1, value2, "big");
            return (Criteria) this;
        }

        public Criteria andBigNotBetween(String value1, String value2) {
            addCriterion("big not between", value1, value2, "big");
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