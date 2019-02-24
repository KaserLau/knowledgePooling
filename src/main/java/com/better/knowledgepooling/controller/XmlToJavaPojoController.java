package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.bean.BaggageAllowanceResponse.BaggageAllowanceResponse;
import com.better.knowledgepooling.util.XmlToBeanUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/24/2019$ 4:56 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
@RestController
public class XmlToJavaPojoController {
    @GetMapping(value = "/get/baggage/response")
    public BaggageAllowanceResponse getBaggageData() throws Exception {
        String xmlFormateData = this.getXmlData();
        BaggageAllowanceResponse response  = XmlToBeanUtil.convertToJavaBean(xmlFormateData, BaggageAllowanceResponse.class);
        return response;
    }
    /*
    * 讲解一下XML数据与Java bean -> BaggageAllowanceResponse 转换的使用：
    * 1.XML数据传输过程中先把它转换为字符串（String）格式，方便使用new StringReader()等方法
    * 2.这里POJO bean BaggageAllowanceResponse 在使用 Unmarshaller 的使用需要用到指定的注解来启动对XML中字符串的识别：
    *   a. 如这里xml数据中的<baggageResponse>是开头的标签，需要用到@XmlRootElement注解指定该标签的内容使它对应 Java Bean BaggageAllowanceResponse，完整的的使用：@XmlRootElement(name = "baggageResponse")
    *   b. 使用@XmlElement(name = "document", required = true)，指定XML 数据 <document>的内容，对应的就是Document对象：private Document document
    *   c. 当XML中有多个相同标签内容的时候其实对应的就是Java中ArrayList的对象： 如：<originDestination>***</originDestination><originDestination>***</originDestination> 对应的就是：private List<OriginDestination> originDestination;
    *   d. 如XML中出现： <mediaList/>这种类型的数据时，表明mediaList是没东西的，但是对应的是private MediaList mediaList;也会接收但是值为null
    * 3.需要注意的是使用标签@XmlElement(name = "document")或者@XmlRootElement 里面的名字一定要与XML标签指定的值大小写一致。
    * */

    /**
     * @Created by yaobin.a.liu
     * @CreateDate: 2/24/2019 4:21 PM
     * @Description :
     * 在这个xml数据中，
     * 有普通parameter-value类型，例如：<success>true<success/>,
     * 有Object类型，例如：<document><referenceVersion>18.1</referenceVersion></document>,
     * 有ArrayList类型，例如：<originDestination>***</originDestination><originDestination>***</originDestination>,
     * 有空对象类型，例如：<mediaList/>，
     * 还有一个特殊情况就是像在参数中还有参数的情况：例如参数refs在checkedBag中 <checkedBag refs="PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6">
     */
    private String getXmlData(){
        String xmlData = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "\n" +
                "<baggageResponse>\n" +
                "  <success>true</success>\n" +
                "  <document>\n" +
                "    <referenceVersion>18.1</referenceVersion>\n" +
                "  </document>\n" +
                "  <originDestination>\n" +
                "    <departureCode>SIN</departureCode>\n" +
                "    <arrivalCode>HKG</arrivalCode>\n" +
                "    <checkedBags>\n" +
                "      <checkedBag refs=\"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\">\n" +
                "        <pieceAllowance>\n" +
                "          <totalQuantity>2</totalQuantity>\n" +
                "          <descriptions>\n" +
                "            <description>\n" +
                "              <text>Check-in bag</text>\n" +
                "            </description>\n" +
                "          </descriptions>\n" +
                "          <pieceMeasurements Quantity=\"2\">\n" +
                "            <pieceWeightAllowance>\n" +
                "              <maximumWeight>\n" +
                "                <value>30.0</value>\n" +
                "                <uOM>KG</uOM>\n" +
                "                <spreadOverBagsQuantity>2</spreadOverBagsQuantity>\n" +
                "              </maximumWeight>\n" +
                "            </pieceWeightAllowance>\n" +
                "            <pieceDimensionAllowance>\n" +
                "              <dimensionUOM>Centimeter</dimensionUOM>\n" +
                "              <maxLinear>3.00</maxLinear>\n" +
                "              <minLinear>3.00</minLinear>\n" +
                "            </pieceDimensionAllowance>\n" +
                "          </pieceMeasurements>\n" +
                "        </pieceAllowance>\n" +
                "      </checkedBag>\n" +
                "      <checkedBag refs=\"PAX_LIST_ID_3\">\n" +
                "        <pieceAllowance>\n" +
                "          <totalQuantity>2</totalQuantity>\n" +
                "          <descriptions>\n" +
                "            <description>\n" +
                "              <text>Check-in bag</text>\n" +
                "            </description>\n" +
                "          </descriptions>\n" +
                "          <pieceMeasurements Quantity=\"2\">\n" +
                "            <pieceWeightAllowance>\n" +
                "              <maximumWeight>\n" +
                "                <value>30.0</value>\n" +
                "                <uOM>KG</uOM>\n" +
                "                <spreadOverBagsQuantity>2</spreadOverBagsQuantity>\n" +
                "              </maximumWeight>\n" +
                "            </pieceWeightAllowance>\n" +
                "            <pieceDimensionAllowance>\n" +
                "              <dimensionUOM>Centimeter</dimensionUOM>\n" +
                "              <maxLinear>3.00</maxLinear>\n" +
                "              <minLinear>3.00</minLinear>\n" +
                "            </pieceDimensionAllowance>\n" +
                "          </pieceMeasurements>\n" +
                "        </pieceAllowance>\n" +
                "      </checkedBag>\n" +
                "      <checkedBag refs=\"PAX_LIST_ID_4 PAX_LIST_ID_7\">\n" +
                "        <weightAllowance/>\n" +
                "        <pieceAllowance>\n" +
                "          <totalQuantity>2</totalQuantity>\n" +
                "          <descriptions>\n" +
                "            <description>\n" +
                "              <text>Check-in bag</text>\n" +
                "            </description>\n" +
                "          </descriptions>\n" +
                "          <pieceMeasurements Quantity=\"2\">\n" +
                "            <pieceWeightAllowance>\n" +
                "              <maximumWeight>\n" +
                "                <value>10.0</value>\n" +
                "                <uOM>KG</uOM>\n" +
                "                <spreadOverBagsQuantity>2</spreadOverBagsQuantity>\n" +
                "              </maximumWeight>\n" +
                "            </pieceWeightAllowance>\n" +
                "            <pieceDimensionAllowance>\n" +
                "              <dimensionUOM>Centimeter</dimensionUOM>\n" +
                "              <maxLinear>3.00</maxLinear>\n" +
                "              <minLinear>3.00</minLinear>\n" +
                "            </pieceDimensionAllowance>\n" +
                "          </pieceMeasurements>\n" +
                "        </pieceAllowance>\n" +
                "      </checkedBag>\n" +
                "    </checkedBags>\n" +
                "  </originDestination>\n" +
                "  <originDestination>\n" +
                "    <departureCode>MEL</departureCode>\n" +
                "    <arrivalCode>CAN</arrivalCode>\n" +
                "    <checkedBags>\n" +
                "      <checkedBag refs=\"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\">\n" +
                "        <pieceAllowance>\n" +
                "          <totalQuantity>2</totalQuantity>\n" +
                "          <descriptions>\n" +
                "            <description>\n" +
                "              <text>Check-in bag</text>\n" +
                "            </description>\n" +
                "          </descriptions>\n" +
                "          <pieceMeasurements Quantity=\"2\">\n" +
                "            <pieceWeightAllowance>\n" +
                "              <maximumWeight>\n" +
                "                <value>35.0</value>\n" +
                "                <uOM>KG</uOM>\n" +
                "                <spreadOverBagsQuantity>2</spreadOverBagsQuantity>\n" +
                "              </maximumWeight>\n" +
                "            </pieceWeightAllowance>\n" +
                "            <pieceDimensionAllowance>\n" +
                "              <dimensionUOM>Centimeter</dimensionUOM>\n" +
                "              <maxLinear>3.00</maxLinear>\n" +
                "              <minLinear>3.00</minLinear>\n" +
                "            </pieceDimensionAllowance>\n" +
                "          </pieceMeasurements>\n" +
                "        </pieceAllowance>\n" +
                "      </checkedBag>\n" +
                "    </checkedBags>\n" +
                "  </originDestination>\n" +
                "  <dataLists>\n" +
                "    <mediaList/>\n" +
                "    <passengerList>\n" +
                "      <passenger PassengerID=\"PAX_LIST_ID_1\">\n" +
                "        <ptc>ADT</ptc>\n" +
                "      </passenger>\n" +
                "      <passenger PassengerID=\"PAX_LIST_ID_2\">\n" +
                "        <ptc>ADT</ptc>\n" +
                "      </passenger>\n" +
                "      <passenger PassengerID=\"PAX_LIST_ID_5\">\n" +
                "        <ptc>ADT</ptc>\n" +
                "      </passenger>\n" +
                "    </passengerList>\n" +
                "  </dataLists>\n" +
                "</baggageResponse>\n";
        return xmlData;
    }

     /**
      * @Created by yaobin.a.liu
      * @CreateDate: 2/24/2019 5:12 PM
      * @Description : 调用/get/baggage/response，把xml的数据转换为Java bean POJO 的数据如下
      */
    private String returnJsonData(){
        String jsonData = "{\n" +
                "    \"document\": {\n" +
                "        \"referenceVersion\": \"18.1\"\n" +
                "    },\n" +
                "    \"originDestination\": [\n" +
                "        {\n" +
                "            \"departureCode\": \"SIN\",\n" +
                "            \"arrivalCode\": \"HKG\",\n" +
                "            \"checkedBags\": {\n" +
                "                \"checkedBag\": [\n" +
                "                    {\n" +
                "                        \"refs\": \"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\",\n" +
                "                        \"pieceAllowance\": {\n" +
                "                            \"applicableParty\": null,\n" +
                "                            \"totalQuantity\": \"2\",\n" +
                "                            \"descriptions\": {\n" +
                "                                \"description\": {\n" +
                "                                    \"text\": \"Check-in bag\",\n" +
                "                                    \"media\": null\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"pieceMeasurements\": {\n" +
                "                                \"quantity\": \"2\",\n" +
                "                                \"pieceWeightAllowance\": {\n" +
                "                                    \"applicableParty\": null,\n" +
                "                                    \"maximumWeight\": {\n" +
                "                                        \"value\": \"30.0\",\n" +
                "                                        \"spreadOverBagsQuantity\": 2,\n" +
                "                                        \"uom\": \"KG\"\n" +
                "                                    }\n" +
                "                                },\n" +
                "                                \"pieceDimensionAllowance\": {\n" +
                "                                    \"applicableParty\": null,\n" +
                "                                    \"dimensionUOM\": \"Centimeter\",\n" +
                "                                    \"maxLinear\": \"3.00\",\n" +
                "                                    \"minLinear\": \"3.00\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"weightAllowance\": null\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"refs\": \"PAX_LIST_ID_3\",\n" +
                "                        \"pieceAllowance\": {\n" +
                "                            \"applicableParty\": null,\n" +
                "                            \"totalQuantity\": \"2\",\n" +
                "                            \"descriptions\": {\n" +
                "                                \"description\": {\n" +
                "                                    \"text\": \"Check-in bag\",\n" +
                "                                    \"media\": null\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"pieceMeasurements\": {\n" +
                "                                \"quantity\": \"2\",\n" +
                "                                \"pieceWeightAllowance\": {\n" +
                "                                    \"applicableParty\": null,\n" +
                "                                    \"maximumWeight\": {\n" +
                "                                        \"value\": \"30.0\",\n" +
                "                                        \"spreadOverBagsQuantity\": 2,\n" +
                "                                        \"uom\": \"KG\"\n" +
                "                                    }\n" +
                "                                },\n" +
                "                                \"pieceDimensionAllowance\": {\n" +
                "                                    \"applicableParty\": null,\n" +
                "                                    \"dimensionUOM\": \"Centimeter\",\n" +
                "                                    \"maxLinear\": \"3.00\",\n" +
                "                                    \"minLinear\": \"3.00\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"weightAllowance\": null\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"refs\": \"PAX_LIST_ID_4 PAX_LIST_ID_7\",\n" +
                "                        \"pieceAllowance\": {\n" +
                "                            \"applicableParty\": null,\n" +
                "                            \"totalQuantity\": \"2\",\n" +
                "                            \"descriptions\": {\n" +
                "                                \"description\": {\n" +
                "                                    \"text\": \"Check-in bag\",\n" +
                "                                    \"media\": null\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"pieceMeasurements\": {\n" +
                "                                \"quantity\": \"2\",\n" +
                "                                \"pieceWeightAllowance\": {\n" +
                "                                    \"applicableParty\": null,\n" +
                "                                    \"maximumWeight\": {\n" +
                "                                        \"value\": \"10.0\",\n" +
                "                                        \"spreadOverBagsQuantity\": 2,\n" +
                "                                        \"uom\": \"KG\"\n" +
                "                                    }\n" +
                "                                },\n" +
                "                                \"pieceDimensionAllowance\": {\n" +
                "                                    \"applicableParty\": null,\n" +
                "                                    \"dimensionUOM\": \"Centimeter\",\n" +
                "                                    \"maxLinear\": \"3.00\",\n" +
                "                                    \"minLinear\": \"3.00\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"weightAllowance\": [\n" +
                "                            {\n" +
                "                                \"applicableParty\": null,\n" +
                "                                \"maximumWeight\": null,\n" +
                "                                \"descriptions\": null,\n" +
                "                                \"dimensionAllowance\": null\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"departureCode\": \"MEL\",\n" +
                "            \"arrivalCode\": \"CAN\",\n" +
                "            \"checkedBags\": {\n" +
                "                \"checkedBag\": [\n" +
                "                    {\n" +
                "                        \"refs\": \"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\",\n" +
                "                        \"pieceAllowance\": {\n" +
                "                            \"applicableParty\": null,\n" +
                "                            \"totalQuantity\": \"2\",\n" +
                "                            \"descriptions\": {\n" +
                "                                \"description\": {\n" +
                "                                    \"text\": \"Check-in bag\",\n" +
                "                                    \"media\": null\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"pieceMeasurements\": {\n" +
                "                                \"quantity\": \"2\",\n" +
                "                                \"pieceWeightAllowance\": {\n" +
                "                                    \"applicableParty\": null,\n" +
                "                                    \"maximumWeight\": {\n" +
                "                                        \"value\": \"35.0\",\n" +
                "                                        \"spreadOverBagsQuantity\": 2,\n" +
                "                                        \"uom\": \"KG\"\n" +
                "                                    }\n" +
                "                                },\n" +
                "                                \"pieceDimensionAllowance\": {\n" +
                "                                    \"applicableParty\": null,\n" +
                "                                    \"dimensionUOM\": \"Centimeter\",\n" +
                "                                    \"maxLinear\": \"3.00\",\n" +
                "                                    \"minLinear\": \"3.00\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"weightAllowance\": null\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"dataLists\": {\n" +
                "        \"mediaList\": {\n" +
                "            \"media\": null\n" +
                "        },\n" +
                "        \"passengerList\": {\n" +
                "            \"passenger\": [\n" +
                "                {\n" +
                "                    \"passengerID\": \"PAX_LIST_ID_1\",\n" +
                "                    \"ptc\": \"ADT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"passengerID\": \"PAX_LIST_ID_2\",\n" +
                "                    \"ptc\": \"ADT\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"passengerID\": \"PAX_LIST_ID_5\",\n" +
                "                    \"ptc\": \"ADT\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    },\n" +
                "    \"success\": \"true\"\n" +
                "}";
        return jsonData;
    }
}
