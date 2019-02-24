package com.better.knowledgepooling.testing;

import com.better.knowledgepooling.bean.BaggageAllowanceResponse.BaggageAllowanceResponse;
import com.better.knowledgepooling.util.XmlToBeanUtil;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/24/2019$ 4:18 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
public class TestClass {
    public static void main(String args[]) throws Exception {
        String xmlFormateData = getXmlData();
        BaggageAllowanceResponse response = new BaggageAllowanceResponse();
        response = XmlToBeanUtil.convertToJavaBean(xmlFormateData, BaggageAllowanceResponse.class);
        System.out.println("BaggageAllowanceResponse : " + response);
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
    public static String getXmlData(){
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
}
