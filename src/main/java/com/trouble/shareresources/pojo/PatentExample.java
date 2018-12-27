package com.trouble.shareresources.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatentExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPatentNoIsNull() {
            addCriterion("patent_no is null");
            return (Criteria) this;
        }

        public Criteria andPatentNoIsNotNull() {
            addCriterion("patent_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatentNoEqualTo(String value) {
            addCriterion("patent_no =", value, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoNotEqualTo(String value) {
            addCriterion("patent_no <>", value, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoGreaterThan(String value) {
            addCriterion("patent_no >", value, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoGreaterThanOrEqualTo(String value) {
            addCriterion("patent_no >=", value, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoLessThan(String value) {
            addCriterion("patent_no <", value, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoLessThanOrEqualTo(String value) {
            addCriterion("patent_no <=", value, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoLike(String value) {
            addCriterion("patent_no like", value, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoNotLike(String value) {
            addCriterion("patent_no not like", value, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoIn(List<String> values) {
            addCriterion("patent_no in", values, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoNotIn(List<String> values) {
            addCriterion("patent_no not in", values, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoBetween(String value1, String value2) {
            addCriterion("patent_no between", value1, value2, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentNoNotBetween(String value1, String value2) {
            addCriterion("patent_no not between", value1, value2, "patentNo");
            return (Criteria) this;
        }

        public Criteria andPatentTypeIsNull() {
            addCriterion("patent_type is null");
            return (Criteria) this;
        }

        public Criteria andPatentTypeIsNotNull() {
            addCriterion("patent_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatentTypeEqualTo(String value) {
            addCriterion("patent_type =", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotEqualTo(String value) {
            addCriterion("patent_type <>", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeGreaterThan(String value) {
            addCriterion("patent_type >", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("patent_type >=", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLessThan(String value) {
            addCriterion("patent_type <", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLessThanOrEqualTo(String value) {
            addCriterion("patent_type <=", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeLike(String value) {
            addCriterion("patent_type like", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotLike(String value) {
            addCriterion("patent_type not like", value, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeIn(List<String> values) {
            addCriterion("patent_type in", values, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotIn(List<String> values) {
            addCriterion("patent_type not in", values, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeBetween(String value1, String value2) {
            addCriterion("patent_type between", value1, value2, "patentType");
            return (Criteria) this;
        }

        public Criteria andPatentTypeNotBetween(String value1, String value2) {
            addCriterion("patent_type not between", value1, value2, "patentType");
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

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterionForJDBCDate("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andFieldIsNull() {
            addCriterion("field is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsNotNull() {
            addCriterion("field is not null");
            return (Criteria) this;
        }

        public Criteria andFieldEqualTo(String value) {
            addCriterion("field =", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotEqualTo(String value) {
            addCriterion("field <>", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThan(String value) {
            addCriterion("field >", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThanOrEqualTo(String value) {
            addCriterion("field >=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThan(String value) {
            addCriterion("field <", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThanOrEqualTo(String value) {
            addCriterion("field <=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLike(String value) {
            addCriterion("field like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotLike(String value) {
            addCriterion("field not like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldIn(List<String> values) {
            addCriterion("field in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotIn(List<String> values) {
            addCriterion("field not in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldBetween(String value1, String value2) {
            addCriterion("field between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotBetween(String value1, String value2) {
            addCriterion("field not between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerIsNull() {
            addCriterion("patent_owner is null");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerIsNotNull() {
            addCriterion("patent_owner is not null");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerEqualTo(String value) {
            addCriterion("patent_owner =", value, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerNotEqualTo(String value) {
            addCriterion("patent_owner <>", value, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerGreaterThan(String value) {
            addCriterion("patent_owner >", value, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("patent_owner >=", value, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerLessThan(String value) {
            addCriterion("patent_owner <", value, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerLessThanOrEqualTo(String value) {
            addCriterion("patent_owner <=", value, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerLike(String value) {
            addCriterion("patent_owner like", value, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerNotLike(String value) {
            addCriterion("patent_owner not like", value, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerIn(List<String> values) {
            addCriterion("patent_owner in", values, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerNotIn(List<String> values) {
            addCriterion("patent_owner not in", values, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerBetween(String value1, String value2) {
            addCriterion("patent_owner between", value1, value2, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andPatentOwnerNotBetween(String value1, String value2) {
            addCriterion("patent_owner not between", value1, value2, "patentOwner");
            return (Criteria) this;
        }

        public Criteria andMaturityIsNull() {
            addCriterion("Maturity is null");
            return (Criteria) this;
        }

        public Criteria andMaturityIsNotNull() {
            addCriterion("Maturity is not null");
            return (Criteria) this;
        }

        public Criteria andMaturityEqualTo(String value) {
            addCriterion("Maturity =", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityNotEqualTo(String value) {
            addCriterion("Maturity <>", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityGreaterThan(String value) {
            addCriterion("Maturity >", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityGreaterThanOrEqualTo(String value) {
            addCriterion("Maturity >=", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityLessThan(String value) {
            addCriterion("Maturity <", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityLessThanOrEqualTo(String value) {
            addCriterion("Maturity <=", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityLike(String value) {
            addCriterion("Maturity like", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityNotLike(String value) {
            addCriterion("Maturity not like", value, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityIn(List<String> values) {
            addCriterion("Maturity in", values, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityNotIn(List<String> values) {
            addCriterion("Maturity not in", values, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityBetween(String value1, String value2) {
            addCriterion("Maturity between", value1, value2, "maturity");
            return (Criteria) this;
        }

        public Criteria andMaturityNotBetween(String value1, String value2) {
            addCriterion("Maturity not between", value1, value2, "maturity");
            return (Criteria) this;
        }

        public Criteria andHasSampleIsNull() {
            addCriterion("has_sample is null");
            return (Criteria) this;
        }

        public Criteria andHasSampleIsNotNull() {
            addCriterion("has_sample is not null");
            return (Criteria) this;
        }

        public Criteria andHasSampleEqualTo(Boolean value) {
            addCriterion("has_sample =", value, "hasSample");
            return (Criteria) this;
        }

        public Criteria andHasSampleNotEqualTo(Boolean value) {
            addCriterion("has_sample <>", value, "hasSample");
            return (Criteria) this;
        }

        public Criteria andHasSampleGreaterThan(Boolean value) {
            addCriterion("has_sample >", value, "hasSample");
            return (Criteria) this;
        }

        public Criteria andHasSampleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_sample >=", value, "hasSample");
            return (Criteria) this;
        }

        public Criteria andHasSampleLessThan(Boolean value) {
            addCriterion("has_sample <", value, "hasSample");
            return (Criteria) this;
        }

        public Criteria andHasSampleLessThanOrEqualTo(Boolean value) {
            addCriterion("has_sample <=", value, "hasSample");
            return (Criteria) this;
        }

        public Criteria andHasSampleIn(List<Boolean> values) {
            addCriterion("has_sample in", values, "hasSample");
            return (Criteria) this;
        }

        public Criteria andHasSampleNotIn(List<Boolean> values) {
            addCriterion("has_sample not in", values, "hasSample");
            return (Criteria) this;
        }

        public Criteria andHasSampleBetween(Boolean value1, Boolean value2) {
            addCriterion("has_sample between", value1, value2, "hasSample");
            return (Criteria) this;
        }

        public Criteria andHasSampleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_sample not between", value1, value2, "hasSample");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormIsNull() {
            addCriterion("patent_transfer_form is null");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormIsNotNull() {
            addCriterion("patent_transfer_form is not null");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormEqualTo(String value) {
            addCriterion("patent_transfer_form =", value, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormNotEqualTo(String value) {
            addCriterion("patent_transfer_form <>", value, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormGreaterThan(String value) {
            addCriterion("patent_transfer_form >", value, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormGreaterThanOrEqualTo(String value) {
            addCriterion("patent_transfer_form >=", value, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormLessThan(String value) {
            addCriterion("patent_transfer_form <", value, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormLessThanOrEqualTo(String value) {
            addCriterion("patent_transfer_form <=", value, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormLike(String value) {
            addCriterion("patent_transfer_form like", value, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormNotLike(String value) {
            addCriterion("patent_transfer_form not like", value, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormIn(List<String> values) {
            addCriterion("patent_transfer_form in", values, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormNotIn(List<String> values) {
            addCriterion("patent_transfer_form not in", values, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormBetween(String value1, String value2) {
            addCriterion("patent_transfer_form between", value1, value2, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andPatentTransferFormNotBetween(String value1, String value2) {
            addCriterion("patent_transfer_form not between", value1, value2, "patentTransferForm");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersIsNull() {
            addCriterion("liencese_others is null");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersIsNotNull() {
            addCriterion("liencese_others is not null");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersEqualTo(Boolean value) {
            addCriterion("liencese_others =", value, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersNotEqualTo(Boolean value) {
            addCriterion("liencese_others <>", value, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersGreaterThan(Boolean value) {
            addCriterion("liencese_others >", value, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersGreaterThanOrEqualTo(Boolean value) {
            addCriterion("liencese_others >=", value, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersLessThan(Boolean value) {
            addCriterion("liencese_others <", value, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersLessThanOrEqualTo(Boolean value) {
            addCriterion("liencese_others <=", value, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersIn(List<Boolean> values) {
            addCriterion("liencese_others in", values, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersNotIn(List<Boolean> values) {
            addCriterion("liencese_others not in", values, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersBetween(Boolean value1, Boolean value2) {
            addCriterion("liencese_others between", value1, value2, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andLienceseOthersNotBetween(Boolean value1, Boolean value2) {
            addCriterion("liencese_others not between", value1, value2, "lienceseOthers");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsIsNull() {
            addCriterion("site_requirements is null");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsIsNotNull() {
            addCriterion("site_requirements is not null");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsEqualTo(String value) {
            addCriterion("site_requirements =", value, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsNotEqualTo(String value) {
            addCriterion("site_requirements <>", value, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsGreaterThan(String value) {
            addCriterion("site_requirements >", value, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("site_requirements >=", value, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsLessThan(String value) {
            addCriterion("site_requirements <", value, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsLessThanOrEqualTo(String value) {
            addCriterion("site_requirements <=", value, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsLike(String value) {
            addCriterion("site_requirements like", value, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsNotLike(String value) {
            addCriterion("site_requirements not like", value, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsIn(List<String> values) {
            addCriterion("site_requirements in", values, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsNotIn(List<String> values) {
            addCriterion("site_requirements not in", values, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsBetween(String value1, String value2) {
            addCriterion("site_requirements between", value1, value2, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andSiteRequirementsNotBetween(String value1, String value2) {
            addCriterion("site_requirements not between", value1, value2, "siteRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsIsNull() {
            addCriterion("personnel_requirements is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsIsNotNull() {
            addCriterion("personnel_requirements is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsEqualTo(String value) {
            addCriterion("personnel_requirements =", value, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsNotEqualTo(String value) {
            addCriterion("personnel_requirements <>", value, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsGreaterThan(String value) {
            addCriterion("personnel_requirements >", value, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("personnel_requirements >=", value, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsLessThan(String value) {
            addCriterion("personnel_requirements <", value, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsLessThanOrEqualTo(String value) {
            addCriterion("personnel_requirements <=", value, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsLike(String value) {
            addCriterion("personnel_requirements like", value, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsNotLike(String value) {
            addCriterion("personnel_requirements not like", value, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsIn(List<String> values) {
            addCriterion("personnel_requirements in", values, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsNotIn(List<String> values) {
            addCriterion("personnel_requirements not in", values, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsBetween(String value1, String value2) {
            addCriterion("personnel_requirements between", value1, value2, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andPersonnelRequirementsNotBetween(String value1, String value2) {
            addCriterion("personnel_requirements not between", value1, value2, "personnelRequirements");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedIsNull() {
            addCriterion("revenue_expected is null");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedIsNotNull() {
            addCriterion("revenue_expected is not null");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedEqualTo(String value) {
            addCriterion("revenue_expected =", value, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedNotEqualTo(String value) {
            addCriterion("revenue_expected <>", value, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedGreaterThan(String value) {
            addCriterion("revenue_expected >", value, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedGreaterThanOrEqualTo(String value) {
            addCriterion("revenue_expected >=", value, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedLessThan(String value) {
            addCriterion("revenue_expected <", value, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedLessThanOrEqualTo(String value) {
            addCriterion("revenue_expected <=", value, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedLike(String value) {
            addCriterion("revenue_expected like", value, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedNotLike(String value) {
            addCriterion("revenue_expected not like", value, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedIn(List<String> values) {
            addCriterion("revenue_expected in", values, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedNotIn(List<String> values) {
            addCriterion("revenue_expected not in", values, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedBetween(String value1, String value2) {
            addCriterion("revenue_expected between", value1, value2, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andRevenueExpectedNotBetween(String value1, String value2) {
            addCriterion("revenue_expected not between", value1, value2, "revenueExpected");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNull() {
            addCriterion("review_date is null");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNotNull() {
            addCriterion("review_date is not null");
            return (Criteria) this;
        }

        public Criteria andReviewDateEqualTo(Date value) {
            addCriterionForJDBCDate("review_date =", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("review_date <>", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThan(Date value) {
            addCriterionForJDBCDate("review_date >", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("review_date >=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThan(Date value) {
            addCriterionForJDBCDate("review_date <", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("review_date <=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateIn(List<Date> values) {
            addCriterionForJDBCDate("review_date in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("review_date not in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("review_date between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("review_date not between", value1, value2, "reviewDate");
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