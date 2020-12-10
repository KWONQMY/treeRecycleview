package com.example.treelist2;

import java.util.List;

public class NodeBean {

        /**
         * createdByName : admin
         * modifiedTime : 1605169536000
         * code : 01
         * modifiedByName : admin
         * entrepriseId : 4
         * createdBy : 1
         * children : [{"createdByName":"admin","modifiedTime":1605169550000,"code":"0101","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"差旅费","createdTime":1605169550000,"modifiedBy":1,"id":8,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0102","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"招待费","createdTime":1605169550000,"modifiedBy":1,"id":9,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0103","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"投标保证金（仅用于借款）","createdTime":1605169550000,"modifiedBy":1,"id":10,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0104","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[{"createdByName":"admin","modifiedTime":1605169551000,"code":"010401","entrepriseId":4,"pid":11,"modifiedByName":"admin","createdBy":1,"children":[],"name":"交通费","createdTime":1605169551000,"modifiedBy":1,"id":51,"status":0},{"createdByName":"admin","modifiedTime":1605169551000,"code":"010402","entrepriseId":4,"pid":11,"modifiedByName":"admin","createdBy":1,"children":[],"name":"车杂费","createdTime":1605169551000,"modifiedBy":1,"id":52,"status":0},{"createdByName":"admin","modifiedTime":1605169551000,"code":"010403","entrepriseId":4,"pid":11,"modifiedByName":"admin","createdBy":1,"children":[],"name":"车辆租赁费","createdTime":1605169551000,"modifiedBy":1,"id":53,"status":0}],"name":"业务用车费","createdTime":1605169550000,"modifiedBy":1,"id":11,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0105","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"通讯费","createdTime":1605169550000,"modifiedBy":1,"id":12,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0106","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"租赁费","createdTime":1605169550000,"modifiedBy":1,"id":13,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0107","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"会议费","createdTime":1605169550000,"modifiedBy":1,"id":14,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0108","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[{"createdByName":"admin","modifiedTime":1605169551000,"code":"010801","entrepriseId":4,"pid":15,"modifiedByName":"admin","createdBy":1,"children":[],"name":"咨询认证费","createdTime":1605169551000,"modifiedBy":1,"id":54,"status":0},{"createdByName":"admin","modifiedTime":1605169551000,"code":"010802","entrepriseId":4,"pid":15,"modifiedByName":"admin","createdBy":1,"children":[],"name":"广告宣传费","createdTime":1605169551000,"modifiedBy":1,"id":55,"status":0},{"createdByName":"admin","modifiedTime":1605169551000,"code":"010803","entrepriseId":4,"pid":15,"modifiedByName":"admin","createdBy":1,"children":[],"name":"法律顾问费","createdTime":1605169551000,"modifiedBy":1,"id":56,"status":0},{"createdByName":"admin","modifiedTime":1605169551000,"code":"010804","entrepriseId":4,"pid":15,"modifiedByName":"admin","createdBy":1,"children":[],"name":"审计费","createdTime":1605169551000,"modifiedBy":1,"id":57,"status":0}],"name":"咨询费、法律顾问及审计费","createdTime":1605169550000,"modifiedBy":1,"id":15,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0109","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"办公家具费","createdTime":1605169550000,"modifiedBy":1,"id":16,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0110","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"系统维护建设费","createdTime":1605169550000,"modifiedBy":1,"id":17,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0111","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[{"createdByName":"admin","modifiedTime":1605169551000,"code":"011101","entrepriseId":4,"pid":18,"modifiedByName":"admin","createdBy":1,"children":[],"name":"研究支出","createdTime":1605169551000,"modifiedBy":1,"id":58,"status":0},{"createdByName":"admin","modifiedTime":1605169551000,"code":"011102","entrepriseId":4,"pid":18,"modifiedByName":"admin","createdBy":1,"children":[],"name":"开发支出","createdTime":1605169551000,"modifiedBy":1,"id":59,"status":0}],"name":"研发费","createdTime":1605169550000,"modifiedBy":1,"id":18,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0112","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"劳务费","createdTime":1605169550000,"modifiedBy":1,"id":19,"status":0},{"createdByName":"admin","modifiedTime":1605169550000,"code":"0113","entrepriseId":4,"pid":1,"modifiedByName":"admin","createdBy":1,"children":[],"name":"无形资产","createdTime":1605169550000,"modifiedBy":1,"id":20,"status":0}]
         * name : 部门费用
         * createdTime : 1605169536000
         * modifiedBy : 1
         * id : 1
         * status : 0
         */

        private String createdByName;
        private long modifiedTime;
        private String code;
        private String modifiedByName;
        private int entrepriseId;
        private int createdBy;
        private String name;
        private long createdTime;
        private int modifiedBy;
        private int id;
        private int status;
    private int pid;
        private List<ChildrenDTO> children;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getCreatedByName() {
            return createdByName;
        }

        public void setCreatedByName(String createdByName) {
            this.createdByName = createdByName;
        }

        public long getModifiedTime() {
            return modifiedTime;
        }

        public void setModifiedTime(long modifiedTime) {
            this.modifiedTime = modifiedTime;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getModifiedByName() {
            return modifiedByName;
        }

        public void setModifiedByName(String modifiedByName) {
            this.modifiedByName = modifiedByName;
        }

        public int getEntrepriseId() {
            return entrepriseId;
        }

        public void setEntrepriseId(int entrepriseId) {
            this.entrepriseId = entrepriseId;
        }

        public int getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(int createdBy) {
            this.createdBy = createdBy;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(long createdTime) {
            this.createdTime = createdTime;
        }

        public int getModifiedBy() {
            return modifiedBy;
        }

        public void setModifiedBy(int modifiedBy) {
            this.modifiedBy = modifiedBy;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<ChildrenDTO> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenDTO> children) {
            this.children = children;
        }

        public static class ChildrenDTO {
            /**
             * createdByName : admin
             * modifiedTime : 1605169550000
             * code : 0101
             * entrepriseId : 4
             * pid : 1
             * modifiedByName : admin
             * createdBy : 1
             * children : []
             * name : 差旅费
             * createdTime : 1605169550000
             * modifiedBy : 1
             * id : 8
             * status : 0
             */

            private String createdByName;
            private long modifiedTime;
            private String code;
            private int entrepriseId;
            private int pid;
            private String modifiedByName;
            private int createdBy;
            private String name;
            private long createdTime;
            private int modifiedBy;
            private int id;
            private int status;
            private List<ChildrenDTO> children;

            public String getCreatedByName() {
                return createdByName;
            }

            public void setCreatedByName(String createdByName) {
                this.createdByName = createdByName;
            }

            public long getModifiedTime() {
                return modifiedTime;
            }

            public void setModifiedTime(long modifiedTime) {
                this.modifiedTime = modifiedTime;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public int getEntrepriseId() {
                return entrepriseId;
            }

            public void setEntrepriseId(int entrepriseId) {
                this.entrepriseId = entrepriseId;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getModifiedByName() {
                return modifiedByName;
            }

            public void setModifiedByName(String modifiedByName) {
                this.modifiedByName = modifiedByName;
            }

            public int getCreatedBy() {
                return createdBy;
            }

            public void setCreatedBy(int createdBy) {
                this.createdBy = createdBy;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getCreatedTime() {
                return createdTime;
            }

            public void setCreatedTime(long createdTime) {
                this.createdTime = createdTime;
            }

            public int getModifiedBy() {
                return modifiedBy;
            }

            public void setModifiedBy(int modifiedBy) {
                this.modifiedBy = modifiedBy;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ChildrenDTO> getChildren() {
                return children;
            }

            public void setChildren(List<ChildrenDTO> children) {
                this.children = children;
            }

    }
}
