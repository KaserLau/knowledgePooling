package com.better.knowledgepooling.beans;

import lombok.Data;
import net.sf.json.JSONObject;

import java.util.List;

@Data
public class MongoDBDataList {
    private List<JSONObject> datas;
}
