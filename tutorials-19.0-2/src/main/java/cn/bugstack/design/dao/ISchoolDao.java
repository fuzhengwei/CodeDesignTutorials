package cn.bugstack.design.dao;

import cn.bugstack.design.po.School;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);

}
