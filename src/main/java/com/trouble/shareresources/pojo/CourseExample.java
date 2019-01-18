package com.trouble.shareresources.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andTeachersIsNull() {
            addCriterion("teachers is null");
            return (Criteria) this;
        }

        public Criteria andTeachersIsNotNull() {
            addCriterion("teachers is not null");
            return (Criteria) this;
        }

        public Criteria andTeachersEqualTo(String value) {
            addCriterion("teachers =", value, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersNotEqualTo(String value) {
            addCriterion("teachers <>", value, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersGreaterThan(String value) {
            addCriterion("teachers >", value, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersGreaterThanOrEqualTo(String value) {
            addCriterion("teachers >=", value, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersLessThan(String value) {
            addCriterion("teachers <", value, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersLessThanOrEqualTo(String value) {
            addCriterion("teachers <=", value, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersLike(String value) {
            addCriterion("teachers like", value, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersNotLike(String value) {
            addCriterion("teachers not like", value, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersIn(List<String> values) {
            addCriterion("teachers in", values, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersNotIn(List<String> values) {
            addCriterion("teachers not in", values, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersBetween(String value1, String value2) {
            addCriterion("teachers between", value1, value2, "teachers");
            return (Criteria) this;
        }

        public Criteria andTeachersNotBetween(String value1, String value2) {
            addCriterion("teachers not between", value1, value2, "teachers");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionIsNull() {
            addCriterion("abstract_introduction is null");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionIsNotNull() {
            addCriterion("abstract_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionEqualTo(String value) {
            addCriterion("abstract_introduction =", value, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionNotEqualTo(String value) {
            addCriterion("abstract_introduction <>", value, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionGreaterThan(String value) {
            addCriterion("abstract_introduction >", value, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("abstract_introduction >=", value, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionLessThan(String value) {
            addCriterion("abstract_introduction <", value, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionLessThanOrEqualTo(String value) {
            addCriterion("abstract_introduction <=", value, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionLike(String value) {
            addCriterion("abstract_introduction like", value, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionNotLike(String value) {
            addCriterion("abstract_introduction not like", value, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionIn(List<String> values) {
            addCriterion("abstract_introduction in", values, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionNotIn(List<String> values) {
            addCriterion("abstract_introduction not in", values, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionBetween(String value1, String value2) {
            addCriterion("abstract_introduction between", value1, value2, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andAbstractIntroductionNotBetween(String value1, String value2) {
            addCriterion("abstract_introduction not between", value1, value2, "abstractIntroduction");
            return (Criteria) this;
        }

        public Criteria andParticipationIsNull() {
            addCriterion("participation is null");
            return (Criteria) this;
        }

        public Criteria andParticipationIsNotNull() {
            addCriterion("participation is not null");
            return (Criteria) this;
        }

        public Criteria andParticipationEqualTo(Integer value) {
            addCriterion("participation =", value, "participation");
            return (Criteria) this;
        }

        public Criteria andParticipationNotEqualTo(Integer value) {
            addCriterion("participation <>", value, "participation");
            return (Criteria) this;
        }

        public Criteria andParticipationGreaterThan(Integer value) {
            addCriterion("participation >", value, "participation");
            return (Criteria) this;
        }

        public Criteria andParticipationGreaterThanOrEqualTo(Integer value) {
            addCriterion("participation >=", value, "participation");
            return (Criteria) this;
        }

        public Criteria andParticipationLessThan(Integer value) {
            addCriterion("participation <", value, "participation");
            return (Criteria) this;
        }

        public Criteria andParticipationLessThanOrEqualTo(Integer value) {
            addCriterion("participation <=", value, "participation");
            return (Criteria) this;
        }

        public Criteria andParticipationIn(List<Integer> values) {
            addCriterion("participation in", values, "participation");
            return (Criteria) this;
        }

        public Criteria andParticipationNotIn(List<Integer> values) {
            addCriterion("participation not in", values, "participation");
            return (Criteria) this;
        }

        public Criteria andParticipationBetween(Integer value1, Integer value2) {
            addCriterion("participation between", value1, value2, "participation");
            return (Criteria) this;
        }

        public Criteria andParticipationNotBetween(Integer value1, Integer value2) {
            addCriterion("participation not between", value1, value2, "participation");
            return (Criteria) this;
        }

        public Criteria andArrangementIsNull() {
            addCriterion("arrangement is null");
            return (Criteria) this;
        }

        public Criteria andArrangementIsNotNull() {
            addCriterion("arrangement is not null");
            return (Criteria) this;
        }

        public Criteria andArrangementEqualTo(String value) {
            addCriterion("arrangement =", value, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementNotEqualTo(String value) {
            addCriterion("arrangement <>", value, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementGreaterThan(String value) {
            addCriterion("arrangement >", value, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementGreaterThanOrEqualTo(String value) {
            addCriterion("arrangement >=", value, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementLessThan(String value) {
            addCriterion("arrangement <", value, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementLessThanOrEqualTo(String value) {
            addCriterion("arrangement <=", value, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementLike(String value) {
            addCriterion("arrangement like", value, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementNotLike(String value) {
            addCriterion("arrangement not like", value, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementIn(List<String> values) {
            addCriterion("arrangement in", values, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementNotIn(List<String> values) {
            addCriterion("arrangement not in", values, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementBetween(String value1, String value2) {
            addCriterion("arrangement between", value1, value2, "arrangement");
            return (Criteria) this;
        }

        public Criteria andArrangementNotBetween(String value1, String value2) {
            addCriterion("arrangement not between", value1, value2, "arrangement");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicIsNull() {
            addCriterion("introduction_pic is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicIsNotNull() {
            addCriterion("introduction_pic is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicEqualTo(String value) {
            addCriterion("introduction_pic =", value, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicNotEqualTo(String value) {
            addCriterion("introduction_pic <>", value, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicGreaterThan(String value) {
            addCriterion("introduction_pic >", value, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicGreaterThanOrEqualTo(String value) {
            addCriterion("introduction_pic >=", value, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicLessThan(String value) {
            addCriterion("introduction_pic <", value, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicLessThanOrEqualTo(String value) {
            addCriterion("introduction_pic <=", value, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicLike(String value) {
            addCriterion("introduction_pic like", value, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicNotLike(String value) {
            addCriterion("introduction_pic not like", value, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicIn(List<String> values) {
            addCriterion("introduction_pic in", values, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicNotIn(List<String> values) {
            addCriterion("introduction_pic not in", values, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicBetween(String value1, String value2) {
            addCriterion("introduction_pic between", value1, value2, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionPicNotBetween(String value1, String value2) {
            addCriterion("introduction_pic not between", value1, value2, "introductionPic");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoIsNull() {
            addCriterion("introduction_video is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoIsNotNull() {
            addCriterion("introduction_video is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoEqualTo(String value) {
            addCriterion("introduction_video =", value, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoNotEqualTo(String value) {
            addCriterion("introduction_video <>", value, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoGreaterThan(String value) {
            addCriterion("introduction_video >", value, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoGreaterThanOrEqualTo(String value) {
            addCriterion("introduction_video >=", value, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoLessThan(String value) {
            addCriterion("introduction_video <", value, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoLessThanOrEqualTo(String value) {
            addCriterion("introduction_video <=", value, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoLike(String value) {
            addCriterion("introduction_video like", value, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoNotLike(String value) {
            addCriterion("introduction_video not like", value, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoIn(List<String> values) {
            addCriterion("introduction_video in", values, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoNotIn(List<String> values) {
            addCriterion("introduction_video not in", values, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoBetween(String value1, String value2) {
            addCriterion("introduction_video between", value1, value2, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andIntroductionVideoNotBetween(String value1, String value2) {
            addCriterion("introduction_video not between", value1, value2, "introductionVideo");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeIsNull() {
            addCriterion("prerequisite_knowledge is null");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeIsNotNull() {
            addCriterion("prerequisite_knowledge is not null");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeEqualTo(String value) {
            addCriterion("prerequisite_knowledge =", value, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeNotEqualTo(String value) {
            addCriterion("prerequisite_knowledge <>", value, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeGreaterThan(String value) {
            addCriterion("prerequisite_knowledge >", value, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeGreaterThanOrEqualTo(String value) {
            addCriterion("prerequisite_knowledge >=", value, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeLessThan(String value) {
            addCriterion("prerequisite_knowledge <", value, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeLessThanOrEqualTo(String value) {
            addCriterion("prerequisite_knowledge <=", value, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeLike(String value) {
            addCriterion("prerequisite_knowledge like", value, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeNotLike(String value) {
            addCriterion("prerequisite_knowledge not like", value, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeIn(List<String> values) {
            addCriterion("prerequisite_knowledge in", values, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeNotIn(List<String> values) {
            addCriterion("prerequisite_knowledge not in", values, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeBetween(String value1, String value2) {
            addCriterion("prerequisite_knowledge between", value1, value2, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andPrerequisiteKnowledgeNotBetween(String value1, String value2) {
            addCriterion("prerequisite_knowledge not between", value1, value2, "prerequisiteKnowledge");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsIsNull() {
            addCriterion("certificate_requirements is null");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsIsNotNull() {
            addCriterion("certificate_requirements is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsEqualTo(String value) {
            addCriterion("certificate_requirements =", value, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsNotEqualTo(String value) {
            addCriterion("certificate_requirements <>", value, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsGreaterThan(String value) {
            addCriterion("certificate_requirements >", value, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_requirements >=", value, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsLessThan(String value) {
            addCriterion("certificate_requirements <", value, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsLessThanOrEqualTo(String value) {
            addCriterion("certificate_requirements <=", value, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsLike(String value) {
            addCriterion("certificate_requirements like", value, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsNotLike(String value) {
            addCriterion("certificate_requirements not like", value, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsIn(List<String> values) {
            addCriterion("certificate_requirements in", values, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsNotIn(List<String> values) {
            addCriterion("certificate_requirements not in", values, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsBetween(String value1, String value2) {
            addCriterion("certificate_requirements between", value1, value2, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andCertificateRequirementsNotBetween(String value1, String value2) {
            addCriterion("certificate_requirements not between", value1, value2, "certificateRequirements");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsIsNull() {
            addCriterion("reference_materials is null");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsIsNotNull() {
            addCriterion("reference_materials is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsEqualTo(String value) {
            addCriterion("reference_materials =", value, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsNotEqualTo(String value) {
            addCriterion("reference_materials <>", value, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsGreaterThan(String value) {
            addCriterion("reference_materials >", value, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsGreaterThanOrEqualTo(String value) {
            addCriterion("reference_materials >=", value, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsLessThan(String value) {
            addCriterion("reference_materials <", value, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsLessThanOrEqualTo(String value) {
            addCriterion("reference_materials <=", value, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsLike(String value) {
            addCriterion("reference_materials like", value, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsNotLike(String value) {
            addCriterion("reference_materials not like", value, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsIn(List<String> values) {
            addCriterion("reference_materials in", values, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsNotIn(List<String> values) {
            addCriterion("reference_materials not in", values, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsBetween(String value1, String value2) {
            addCriterion("reference_materials between", value1, value2, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andReferenceMaterialsNotBetween(String value1, String value2) {
            addCriterion("reference_materials not between", value1, value2, "referenceMaterials");
            return (Criteria) this;
        }

        public Criteria andCourseAimIsNull() {
            addCriterion("course_aim is null");
            return (Criteria) this;
        }

        public Criteria andCourseAimIsNotNull() {
            addCriterion("course_aim is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAimEqualTo(String value) {
            addCriterion("course_aim =", value, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimNotEqualTo(String value) {
            addCriterion("course_aim <>", value, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimGreaterThan(String value) {
            addCriterion("course_aim >", value, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimGreaterThanOrEqualTo(String value) {
            addCriterion("course_aim >=", value, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimLessThan(String value) {
            addCriterion("course_aim <", value, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimLessThanOrEqualTo(String value) {
            addCriterion("course_aim <=", value, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimLike(String value) {
            addCriterion("course_aim like", value, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimNotLike(String value) {
            addCriterion("course_aim not like", value, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimIn(List<String> values) {
            addCriterion("course_aim in", values, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimNotIn(List<String> values) {
            addCriterion("course_aim not in", values, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimBetween(String value1, String value2) {
            addCriterion("course_aim between", value1, value2, "courseAim");
            return (Criteria) this;
        }

        public Criteria andCourseAimNotBetween(String value1, String value2) {
            addCriterion("course_aim not between", value1, value2, "courseAim");
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