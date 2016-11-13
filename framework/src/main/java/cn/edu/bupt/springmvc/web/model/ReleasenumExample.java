package cn.edu.bupt.springmvc.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReleasenumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String outpatientId;
    protected String week;
    
    public ReleasenumExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }
    
    public void setOutpatientId(String outpatientId) {
        this.outpatientId = outpatientId;
    }

    public String getOutpatientId() {
        return outpatientId;
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

        public Criteria andRealseidIsNull() {
            addCriterion("releaseId is null");
            return (Criteria) this;
        }

        public Criteria andRealseidIsNotNull() {
            addCriterion("releaseId is not null");
            return (Criteria) this;
        }

        public Criteria andRealseidEqualTo(String value) {
            addCriterion("releaseId =", value, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidNotEqualTo(String value) {
            addCriterion("releaseId <>", value, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidGreaterThan(String value) {
            addCriterion("releaseId >", value, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidGreaterThanOrEqualTo(String value) {
            addCriterion("releaseId >=", value, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidLessThan(String value) {
            addCriterion("releaseId <", value, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidLessThanOrEqualTo(String value) {
            addCriterion("releaseId <=", value, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidLike(String value) {
            addCriterion("releaseId like", value, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidNotLike(String value) {
            addCriterion("releaseId not like", value, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidIn(List<String> values) {
            addCriterion("releaseId in", values, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidNotIn(List<String> values) {
            addCriterion("releaseId not in", values, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidBetween(String value1, String value2) {
            addCriterion("releaseId between", value1, value2, "releaseid");
            return (Criteria) this;
        }

        public Criteria andRealseidNotBetween(String value1, String value2) {
            addCriterion("releaseId not between", value1, value2, "releaseid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNull() {
            addCriterion("doctorId is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("doctorId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(String value) {
            addCriterion("doctorId =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(String value) {
            addCriterion("doctorId <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(String value) {
            addCriterion("doctorId >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(String value) {
            addCriterion("doctorId >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(String value) {
            addCriterion("doctorId <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(String value) {
            addCriterion("doctorId <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLike(String value) {
            addCriterion("doctorId like", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotLike(String value) {
            addCriterion("doctorId not like", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<String> values) {
            addCriterion("doctorId in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<String> values) {
            addCriterion("doctorId not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(String value1, String value2) {
            addCriterion("doctorId between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(String value1, String value2) {
            addCriterion("doctorId not between", value1, value2, "doctorid");
            return (Criteria) this;
        }
        
 
        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andIssuccessEqualTo(Byte value) {
            addCriterion("isSuccess =", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotEqualTo(Byte value) {
            addCriterion("isSuccess <>", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThan(Byte value) {
            addCriterion("isSuccess >", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThanOrEqualTo(Byte value) {
            addCriterion("isSuccess >=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThan(Byte value) {
            addCriterion("isSuccess <", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThanOrEqualTo(Byte value) {
            addCriterion("isSuccess <=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessIn(List<Byte> values) {
            addCriterion("isSuccess in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotIn(List<Byte> values) {
            addCriterion("isSuccess not in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessBetween(Byte value1, Byte value2) {
            addCriterion("isSuccess between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotBetween(Byte value1, Byte value2) {
            addCriterion("isSuccess not between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumIsNull() {
            addCriterion("isFamilyNum is null");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumIsNotNull() {
            addCriterion("isFamilyNum is not null");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumEqualTo(Integer value) {
            addCriterion("isFamilyNum =", value, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumNotEqualTo(Integer value) {
            addCriterion("isFamilyNum <>", value, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumGreaterThan(Integer value) {
            addCriterion("isFamilyNum >", value, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("isFamilyNum >=", value, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumLessThan(Integer value) {
            addCriterion("isFamilyNum <", value, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumLessThanOrEqualTo(Integer value) {
            addCriterion("isFamilyNum <=", value, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumIn(List<Integer> values) {
            addCriterion("isFamilyNum in", values, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumNotIn(List<Integer> values) {
            addCriterion("isFamilyNum not in", values, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumBetween(Integer value1, Integer value2) {
            addCriterion("isFamilyNum between", value1, value2, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andIsfamilynumNotBetween(Integer value1, Integer value2) {
            addCriterion("isFamilyNum not between", value1, value2, "isfamilynum");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(String value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(String value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(String value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(String value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(String value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(String value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLike(String value) {
            addCriterion("week like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotLike(String value) {
            addCriterion("week not like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<String> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<String> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(String value1, String value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(String value1, String value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andAmpmIsNull() {
            addCriterion("ampm is null");
            return (Criteria) this;
        }

        public Criteria andAmpmIsNotNull() {
            addCriterion("ampm is not null");
            return (Criteria) this;
        }

        public Criteria andAmpmEqualTo(String value) {
            addCriterion("ampm =", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmNotEqualTo(String value) {
            addCriterion("ampm <>", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmGreaterThan(String value) {
            addCriterion("ampm >", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmGreaterThanOrEqualTo(String value) {
            addCriterion("ampm >=", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmLessThan(String value) {
            addCriterion("ampm <", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmLessThanOrEqualTo(String value) {
            addCriterion("ampm <=", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmLike(String value) {
            addCriterion("ampm like", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmNotLike(String value) {
            addCriterion("ampm not like", value, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmIn(List<String> values) {
            addCriterion("ampm in", values, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmNotIn(List<String> values) {
            addCriterion("ampm not in", values, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmBetween(String value1, String value2) {
            addCriterion("ampm between", value1, value2, "ampm");
            return (Criteria) this;
        }

        public Criteria andAmpmNotBetween(String value1, String value2) {
            addCriterion("ampm not between", value1, value2, "ampm");
            return (Criteria) this;
        }
    }

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