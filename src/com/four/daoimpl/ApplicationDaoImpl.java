package com.four.daoimpl;

import com.four.dao.ApplicationDao;
import com.four.entity.Application;

import java.util.List;

public class ApplicationDaoImpl implements ApplicationDao {
    @Override
    public int addApplication(Application application) {
        return 0;
    }

    @Override
    public int deleteApplicationById(int id) {
        return 0;
    }

    @Override
    public int deleteApplicationByTeamId(int teamId) {
        return 0;
    }

    @Override
    public List<Application> getApplicationListByTeamId(int teamId) {
        return null;
    }

}
