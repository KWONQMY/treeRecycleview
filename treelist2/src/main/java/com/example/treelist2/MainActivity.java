package com.example.treelist2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String s = "[\n" +
            "        {\n" +
            "            \"createdByName\": \"admin\",\n" +
            "            \"modifiedTime\": 1605169536000,\n" +
            "            \"code\": \"01\",\n" +
            "            \"modifiedByName\": \"admin\",\n" +
            "            \"entrepriseId\": 4,\n" +
            "            \"createdBy\": 1,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0101\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"差旅费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 8,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0102\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"招待费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 9,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0103\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"投标保证金（仅用于借款）\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 10,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0104\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"010401\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 11,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"交通费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 51,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"010402\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 11,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"车杂费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 52,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"010403\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 11,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"车辆租赁费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 53,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"name\": \"业务用车费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 11,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0105\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"通讯费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 12,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0106\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"租赁费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 13,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0107\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"会议费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 14,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0108\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"010801\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 15,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"咨询认证费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 54,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"010802\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 15,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"广告宣传费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 55,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"010803\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 15,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"法律顾问费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 56,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"010804\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 15,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"审计费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 57,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"name\": \"咨询费、法律顾问及审计费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 15,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0109\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"办公家具费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 16,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0110\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"系统维护建设费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 17,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0111\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"011101\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 18,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"研究支出\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 58,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"011102\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 18,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"开发支出\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 59,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"name\": \"研发费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 18,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0112\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"劳务费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 19,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0113\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 1,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"无形资产\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 20,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"name\": \"部门费用\",\n" +
            "            \"createdTime\": 1605169536000,\n" +
            "            \"modifiedBy\": 1,\n" +
            "            \"id\": 1,\n" +
            "            \"status\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"createdByName\": \"admin\",\n" +
            "            \"modifiedTime\": 1605169547000,\n" +
            "            \"code\": \"02\",\n" +
            "            \"modifiedByName\": \"admin\",\n" +
            "            \"entrepriseId\": 4,\n" +
            "            \"createdBy\": 1,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0201\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 2,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"020101\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 21,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"基本工资\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 60,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"020102\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 21,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"绩效工资\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 61,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"020103\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 21,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"奖金\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 62,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"name\": \"工资\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 21,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0202\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 2,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"公积金\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 22,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0203\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 2,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"020301\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 23,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"养老保险\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 63,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"020302\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 23,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"医疗保险\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 64,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"020303\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 23,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"失业保险\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 65,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"020304\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 23,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"工伤保险\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 66,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"020305\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 23,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"生育保险\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 67,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"name\": \"社保\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 23,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0204\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 2,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"经济补偿金\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 24,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0205\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 2,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"残保金\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 25,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0206\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 2,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"存档费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 26,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0207\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 2,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"服务费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 27,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"name\": \"人力费\",\n" +
            "            \"createdTime\": 1605169547000,\n" +
            "            \"modifiedBy\": 1,\n" +
            "            \"id\": 2,\n" +
            "            \"status\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"createdByName\": \"admin\",\n" +
            "            \"modifiedTime\": 1605169550000,\n" +
            "            \"code\": \"03\",\n" +
            "            \"modifiedByName\": \"admin\",\n" +
            "            \"entrepriseId\": 4,\n" +
            "            \"createdBy\": 1,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0301\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 3,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030101\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 28,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"公杂费（仅用于运营归口）\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 68,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030102\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 28,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"低值易耗品费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 69,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030103\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 28,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"维修保养费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 70,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030104\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 28,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"运邮费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 71,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030105\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 28,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"办公电话费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 72,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030106\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 28,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"网络费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 73,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"name\": \"公杂费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 28,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0302\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 3,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"装修费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 29,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0303\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 3,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030301\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 30,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"房租\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 74,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030302\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 30,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"水电费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 75,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030303\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 30,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"物业费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 76,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030304\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 30,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"车位费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 77,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"name\": \"房租及物业管理费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 30,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0304\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 3,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169551000,\n" +
            "                            \"code\": \"030401\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 31,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"董监办招待费\",\n" +
            "                            \"createdTime\": 1605169551000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 78,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169552000,\n" +
            "                            \"code\": \"030402\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 31,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"董监办公杂费\",\n" +
            "                            \"createdTime\": 1605169552000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 79,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169552000,\n" +
            "                            \"code\": \"030403\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 31,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"董监办差旅费\",\n" +
            "                            \"createdTime\": 1605169552000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 80,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169552000,\n" +
            "                            \"code\": \"030404\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 31,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"董监办交通费\",\n" +
            "                            \"createdTime\": 1605169552000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 81,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169552000,\n" +
            "                            \"code\": \"030405\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 31,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"董监办通讯费\",\n" +
            "                            \"createdTime\": 1605169552000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 82,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169552000,\n" +
            "                            \"code\": \"030406\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 31,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"董监办会议费\",\n" +
            "                            \"createdTime\": 1605169552000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 83,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"createdByName\": \"admin\",\n" +
            "                            \"modifiedTime\": 1605169552000,\n" +
            "                            \"code\": \"030407\",\n" +
            "                            \"entrepriseId\": 4,\n" +
            "                            \"pid\": 31,\n" +
            "                            \"modifiedByName\": \"admin\",\n" +
            "                            \"createdBy\": 1,\n" +
            "                            \"children\": [],\n" +
            "                            \"name\": \"董监办津贴\",\n" +
            "                            \"createdTime\": 1605169552000,\n" +
            "                            \"modifiedBy\": 1,\n" +
            "                            \"id\": 84,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"name\": \"董监办费用\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 31,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169550000,\n" +
            "                    \"code\": \"0305\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 3,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"党组织工作经费\",\n" +
            "                    \"createdTime\": 1605169550000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 32,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0306\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 3,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"外事费\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 33,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"name\": \"运营归口费用\",\n" +
            "            \"createdTime\": 1605169550000,\n" +
            "            \"modifiedBy\": 1,\n" +
            "            \"id\": 3,\n" +
            "            \"status\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"createdByName\": \"admin\",\n" +
            "            \"modifiedTime\": 1605169550000,\n" +
            "            \"code\": \"04\",\n" +
            "            \"modifiedByName\": \"admin\",\n" +
            "            \"entrepriseId\": 4,\n" +
            "            \"createdBy\": 1,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0401\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 4,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"项目公杂费（仅用于项目）\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 34,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0402\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 4,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"项目物料采购支出\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 35,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0403\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 4,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"项目运邮费\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 36,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0404\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 4,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"项目维修保养费\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 37,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0405\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 4,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"项目招投标费用\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 38,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0406\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 4,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"项目房租\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 39,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0407\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 4,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"项目办公电话费\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 40,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0408\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 4,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"项目劳务费\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 41,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0409\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 4,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"技术人力成本\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 42,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"name\": \"项目直接费用\",\n" +
            "            \"createdTime\": 1605169550000,\n" +
            "            \"modifiedBy\": 1,\n" +
            "            \"id\": 4,\n" +
            "            \"status\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"createdByName\": \"admin\",\n" +
            "            \"modifiedTime\": 1605169550000,\n" +
            "            \"code\": \"05\",\n" +
            "            \"modifiedByName\": \"admin\",\n" +
            "            \"entrepriseId\": 4,\n" +
            "            \"createdBy\": 1,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0501\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 5,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"商品采购\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 43,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0502\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 5,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"项目外包\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 44,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"name\": \"经营类货款支付\",\n" +
            "            \"createdTime\": 1605169550000,\n" +
            "            \"modifiedBy\": 1,\n" +
            "            \"id\": 5,\n" +
            "            \"status\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"createdByName\": \"admin\",\n" +
            "            \"modifiedTime\": 1605169550000,\n" +
            "            \"code\": \"06\",\n" +
            "            \"modifiedByName\": \"admin\",\n" +
            "            \"entrepriseId\": 4,\n" +
            "            \"createdBy\": 1,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0601\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 6,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"机器设备类采购\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 45,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0602\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 6,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"其他自用类固定资产采购\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 46,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0603\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 6,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"其他\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 47,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"name\": \"自用类货款支付\",\n" +
            "            \"createdTime\": 1605169550000,\n" +
            "            \"modifiedBy\": 1,\n" +
            "            \"id\": 6,\n" +
            "            \"status\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"createdByName\": \"admin\",\n" +
            "            \"modifiedTime\": 1605169550000,\n" +
            "            \"code\": \"07\",\n" +
            "            \"modifiedByName\": \"admin\",\n" +
            "            \"entrepriseId\": 4,\n" +
            "            \"createdBy\": 1,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0701\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 7,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"招聘费\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 48,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0702\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 7,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"职工教育经费（培训费）\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 49,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"admin\",\n" +
            "                    \"modifiedTime\": 1605169551000,\n" +
            "                    \"code\": \"0703\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 7,\n" +
            "                    \"modifiedByName\": \"admin\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"福利费\",\n" +
            "                    \"createdTime\": 1605169551000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 50,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"createdByName\": \"zsw\",\n" +
            "                    \"modifiedTime\": 1605177164000,\n" +
            "                    \"code\": \"0704\",\n" +
            "                    \"entrepriseId\": 4,\n" +
            "                    \"pid\": 7,\n" +
            "                    \"modifiedByName\": \"zsw\",\n" +
            "                    \"createdBy\": 1,\n" +
            "                    \"children\": [],\n" +
            "                    \"name\": \"测试\",\n" +
            "                    \"createdTime\": 1605177164000,\n" +
            "                    \"modifiedBy\": 1,\n" +
            "                    \"id\": 85,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"name\": \"人力归口费用\",\n" +
            "            \"createdTime\": 1605169550000,\n" +
            "            \"modifiedBy\": 1,\n" +
            "            \"id\": 7,\n" +
            "            \"status\": 0\n" +
            "        }\n" +
            "    ]";
    private RecyclerView recyclerView;
    private List<Node> mDatas = new ArrayList<Node>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recucle);
/*
        JSONObject jSONObject = JSONObject.parseObject(ss);
        JSONArray array= jSONObject.getJSONArray("data");*/
        List<NodeBean> resultList = JSONArray.parseArray(s, NodeBean.class);

        for (int i = 0; i < resultList.size(); i++) {
            mDatas.add(new Node<>(resultList.get(i).getId() + "", resultList.get(i).getPid() + "", resultList.get(i).getName()));
            if (resultList.get(i).getChildren() != null) {
                List<NodeBean.ChildrenDTO> children = resultList.get(i).getChildren();
                for (NodeBean.ChildrenDTO nodes : children) {
                    mDatas.add(new Node<>(nodes.getId() + "", nodes.getPid() + "", nodes.getName()));
                    show(nodes);
                }
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        TemplateTreeRecyclerAdapter departmentAdapter = new TemplateTreeRecyclerAdapter(recyclerView, this, mDatas, 3, R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        departmentAdapter.setOnTreeNodeClickListener(this::onClick);
        recyclerView.setAdapter(departmentAdapter);
    }

    private void show(NodeBean.ChildrenDTO nodes) {
        if (nodes.getChildren() != null) {

            for (NodeBean.ChildrenDTO nodes1 : nodes.getChildren()) {
                mDatas.add(new Node<>(nodes1.getId()+"", nodes1.getPid()+"", nodes1.getName()));
                show(nodes1);
            }

        }
    }

    private void onClick(Node node, int i) {

        Intent intent = new Intent();
        intent.putExtra("name", node.getName());
        intent.putExtra("id", node.getId() + "");
        setResult(Activity.RESULT_OK);
        finish();
    }
}