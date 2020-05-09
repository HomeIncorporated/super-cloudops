package com.wl4g.devops.common.bean.erm;

import com.wl4g.devops.common.bean.BaseBean;

public class K8sCluster extends BaseBean {

    private static final long serialVersionUID = -7546448616357790576L;

    private String name;

    private String masterAddr;

    private String secondaryMasterAddr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMasterAddr() {
        return masterAddr;
    }

    public void setMasterAddr(String masterAddr) {
        this.masterAddr = masterAddr == null ? null : masterAddr.trim();
    }

    public String getSecondaryMasterAddr() {
        return secondaryMasterAddr;
    }

    public void setSecondaryMasterAddr(String secondaryMasterAddr) {
        this.secondaryMasterAddr = secondaryMasterAddr == null ? null : secondaryMasterAddr.trim();
    }

}