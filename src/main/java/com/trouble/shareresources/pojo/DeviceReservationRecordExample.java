package com.trouble.shareresources.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DeviceReservationRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceReservationRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReservationDateIsNull() {
            addCriterion("reservation_date is null");
            return (Criteria) this;
        }

        public Criteria andReservationDateIsNotNull() {
            addCriterion("reservation_date is not null");
            return (Criteria) this;
        }

        public Criteria andReservationDateEqualTo(Date value) {
            addCriterionForJDBCDate("reservation_date =", value, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("reservation_date <>", value, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("reservation_date >", value, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reservation_date >=", value, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationDateLessThan(Date value) {
            addCriterionForJDBCDate("reservation_date <", value, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reservation_date <=", value, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationDateIn(List<Date> values) {
            addCriterionForJDBCDate("reservation_date in", values, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("reservation_date not in", values, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reservation_date between", value1, value2, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reservation_date not between", value1, value2, "reservationDate");
            return (Criteria) this;
        }

        public Criteria andReservationProjectIsNull() {
            addCriterion("reservation_project is null");
            return (Criteria) this;
        }

        public Criteria andReservationProjectIsNotNull() {
            addCriterion("reservation_project is not null");
            return (Criteria) this;
        }

        public Criteria andReservationProjectEqualTo(String value) {
            addCriterion("reservation_project =", value, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectNotEqualTo(String value) {
            addCriterion("reservation_project <>", value, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectGreaterThan(String value) {
            addCriterion("reservation_project >", value, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectGreaterThanOrEqualTo(String value) {
            addCriterion("reservation_project >=", value, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectLessThan(String value) {
            addCriterion("reservation_project <", value, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectLessThanOrEqualTo(String value) {
            addCriterion("reservation_project <=", value, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectLike(String value) {
            addCriterion("reservation_project like", value, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectNotLike(String value) {
            addCriterion("reservation_project not like", value, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectIn(List<String> values) {
            addCriterion("reservation_project in", values, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectNotIn(List<String> values) {
            addCriterion("reservation_project not in", values, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectBetween(String value1, String value2) {
            addCriterion("reservation_project between", value1, value2, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationProjectNotBetween(String value1, String value2) {
            addCriterion("reservation_project not between", value1, value2, "reservationProject");
            return (Criteria) this;
        }

        public Criteria andReservationUserIsNull() {
            addCriterion("reservation_user is null");
            return (Criteria) this;
        }

        public Criteria andReservationUserIsNotNull() {
            addCriterion("reservation_user is not null");
            return (Criteria) this;
        }

        public Criteria andReservationUserEqualTo(String value) {
            addCriterion("reservation_user =", value, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserNotEqualTo(String value) {
            addCriterion("reservation_user <>", value, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserGreaterThan(String value) {
            addCriterion("reservation_user >", value, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserGreaterThanOrEqualTo(String value) {
            addCriterion("reservation_user >=", value, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserLessThan(String value) {
            addCriterion("reservation_user <", value, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserLessThanOrEqualTo(String value) {
            addCriterion("reservation_user <=", value, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserLike(String value) {
            addCriterion("reservation_user like", value, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserNotLike(String value) {
            addCriterion("reservation_user not like", value, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserIn(List<String> values) {
            addCriterion("reservation_user in", values, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserNotIn(List<String> values) {
            addCriterion("reservation_user not in", values, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserBetween(String value1, String value2) {
            addCriterion("reservation_user between", value1, value2, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUserNotBetween(String value1, String value2) {
            addCriterion("reservation_user not between", value1, value2, "reservationUser");
            return (Criteria) this;
        }

        public Criteria andReservationUnitIsNull() {
            addCriterion("reservation_unit is null");
            return (Criteria) this;
        }

        public Criteria andReservationUnitIsNotNull() {
            addCriterion("reservation_unit is not null");
            return (Criteria) this;
        }

        public Criteria andReservationUnitEqualTo(String value) {
            addCriterion("reservation_unit =", value, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitNotEqualTo(String value) {
            addCriterion("reservation_unit <>", value, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitGreaterThan(String value) {
            addCriterion("reservation_unit >", value, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitGreaterThanOrEqualTo(String value) {
            addCriterion("reservation_unit >=", value, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitLessThan(String value) {
            addCriterion("reservation_unit <", value, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitLessThanOrEqualTo(String value) {
            addCriterion("reservation_unit <=", value, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitLike(String value) {
            addCriterion("reservation_unit like", value, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitNotLike(String value) {
            addCriterion("reservation_unit not like", value, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitIn(List<String> values) {
            addCriterion("reservation_unit in", values, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitNotIn(List<String> values) {
            addCriterion("reservation_unit not in", values, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitBetween(String value1, String value2) {
            addCriterion("reservation_unit between", value1, value2, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andReservationUnitNotBetween(String value1, String value2) {
            addCriterion("reservation_unit not between", value1, value2, "reservationUnit");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
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