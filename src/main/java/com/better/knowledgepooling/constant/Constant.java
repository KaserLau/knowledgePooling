package com.better.knowledgepooling.constant;

/**
 * @param : $PARAM$
 * @Created by yaobin.a.liu
 * @CreateDate: 2/24/2019$ 5:38 PM$
 * @Modify by :
 * @Return :
 * @Exception :
 * @Description :
 */
public class Constant {
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

    public static String getXmlData2(){
        String xmlData = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "\n" +
                "<Envelope>\n" +
                "  <Body>\n" +
                "    <BaggageAllowanceRS>\n" +
                "      <Document>\n" +
                "        <ReferenceVersion>18.1</ReferenceVersion>\n" +
                "      </Document>\n" +
                "      <Success/>\n" +
                "      <OriginDestination>\n" +
                "        <DepartureCode>SIN</DepartureCode>\n" +
                "        <ArrivalCode>HKG</ArrivalCode>\n" +
                "        <CheckedBags>\n" +
                "          <CheckedBag refs=\"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\">\n" +
                "            <WeightAllowance/>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>2</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Check-in bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"2\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>30.0</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>2</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>3.00</MaxLinear>\n" +
                "                  <MinLinear>3.00</MinLinear>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <DimensionAllowance/>\n" +
                "            <AllowanceDescription>\n" +
                "              <Descriptions/>\n" +
                "            </AllowanceDescription>\n" +
                "          </CheckedBag>\n" +
                "          <CheckedBag refs=\"PAX_LIST_ID_3\">\n" +
                "            <WeightAllowance/>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>2</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Check-in bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"2\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>30.0</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>2</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>3.00</MaxLinear>\n" +
                "                  <MinLinear>3.00</MinLinear>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <DimensionAllowance/>\n" +
                "            <AllowanceDescription>\n" +
                "              <Descriptions/>\n" +
                "            </AllowanceDescription>\n" +
                "          </CheckedBag>\n" +
                "          <CheckedBag refs=\"PAX_LIST_ID_4 PAX_LIST_ID_7\">\n" +
                "            <WeightAllowance/>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>2</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Check-in bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"2\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>10.0</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>2</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>3.00</MaxLinear>\n" +
                "                  <MinLinear>3.00</MinLinear>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <DimensionAllowance/>\n" +
                "            <AllowanceDescription>\n" +
                "              <Descriptions/>\n" +
                "            </AllowanceDescription>\n" +
                "          </CheckedBag>\n" +
                "        </CheckedBags>\n" +
                "        <CarryOnBags>\n" +
                "          <CarryOnBag refs=\"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\">\n" +
                "            <WeightAllowance>\n" +
                "              <MaximumWeight/>\n" +
                "              <DimensionAllowance>\n" +
                "                <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                <MaxLinear>85.00</MaxLinear>\n" +
                "                <MinLinear>85.00</MinLinear>\n" +
                "              </DimensionAllowance>\n" +
                "            </WeightAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>7.00</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>1</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>115.00</MaxLinear>\n" +
                "                  <MinLinear>115.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>36.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>23.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>56.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Small Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight/>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>85.00</MaxLinear>\n" +
                "                  <MinLinear>85.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>45.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>10.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>30.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "          </CarryOnBag>\n" +
                "          <CarryOnBag refs=\"PAX_LIST_ID_3\">\n" +
                "            <WeightAllowance>\n" +
                "              <MaximumWeight/>\n" +
                "              <DimensionAllowance>\n" +
                "                <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                <MaxLinear>85.00</MaxLinear>\n" +
                "                <MinLinear>85.00</MinLinear>\n" +
                "              </DimensionAllowance>\n" +
                "            </WeightAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>7.00</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>1</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>115.00</MaxLinear>\n" +
                "                  <MinLinear>115.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>36.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>23.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>56.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Small Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight/>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>85.00</MaxLinear>\n" +
                "                  <MinLinear>85.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>45.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>10.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>30.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "          </CarryOnBag>\n" +
                "          <CarryOnBag refs=\"PAX_LIST_ID_4 PAX_LIST_ID_7\">\n" +
                "            <WeightAllowance>\n" +
                "              <MaximumWeight/>\n" +
                "              <DimensionAllowance>\n" +
                "                <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                <MaxLinear>85.00</MaxLinear>\n" +
                "                <MinLinear>85.00</MinLinear>\n" +
                "              </DimensionAllowance>\n" +
                "            </WeightAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>7.00</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>1</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>115.00</MaxLinear>\n" +
                "                  <MinLinear>115.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>36.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>23.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>56.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Small Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight/>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>85.00</MaxLinear>\n" +
                "                  <MinLinear>85.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>45.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>10.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>30.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "          </CarryOnBag>\n" +
                "        </CarryOnBags>\n" +
                "      </OriginDestination>\n" +
                "      <OriginDestination>\n" +
                "        <DepartureCode>MEL</DepartureCode>\n" +
                "        <ArrivalCode>CAN</ArrivalCode>\n" +
                "        <CheckedBags>\n" +
                "          <CheckedBag refs=\"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\">\n" +
                "            <WeightAllowance/>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>2</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Check-in bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"2\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>35.0</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>2</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>3.00</MaxLinear>\n" +
                "                  <MinLinear>3.00</MinLinear>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <DimensionAllowance/>\n" +
                "            <AllowanceDescription>\n" +
                "              <Descriptions/>\n" +
                "            </AllowanceDescription>\n" +
                "          </CheckedBag>\n" +
                "          <CheckedBag refs=\"PAX_LIST_ID_3\">\n" +
                "            <WeightAllowance/>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>2</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Check-in bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"2\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>35.0</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>2</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>3.00</MaxLinear>\n" +
                "                  <MinLinear>3.00</MinLinear>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <DimensionAllowance/>\n" +
                "            <AllowanceDescription>\n" +
                "              <Descriptions/>\n" +
                "            </AllowanceDescription>\n" +
                "          </CheckedBag>\n" +
                "          <CheckedBag refs=\"PAX_LIST_ID_4 PAX_LIST_ID_7\">\n" +
                "            <WeightAllowance/>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>2</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Check-in bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"2\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>10.0</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>2</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>3.00</MaxLinear>\n" +
                "                  <MinLinear>3.00</MinLinear>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <DimensionAllowance/>\n" +
                "            <AllowanceDescription>\n" +
                "              <Descriptions/>\n" +
                "            </AllowanceDescription>\n" +
                "          </CheckedBag>\n" +
                "        </CheckedBags>\n" +
                "        <CarryOnBags>\n" +
                "          <CarryOnBag refs=\"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\">\n" +
                "            <WeightAllowance>\n" +
                "              <MaximumWeight/>\n" +
                "              <DimensionAllowance>\n" +
                "                <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                <MaxLinear>85.00</MaxLinear>\n" +
                "                <MinLinear>85.00</MinLinear>\n" +
                "              </DimensionAllowance>\n" +
                "            </WeightAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>7.00</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>1</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>115.00</MaxLinear>\n" +
                "                  <MinLinear>115.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>36.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>23.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>56.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Small Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight/>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>85.00</MaxLinear>\n" +
                "                  <MinLinear>85.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>45.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>10.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>30.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "          </CarryOnBag>\n" +
                "          <CarryOnBag refs=\"PAX_LIST_ID_3\">\n" +
                "            <WeightAllowance>\n" +
                "              <MaximumWeight/>\n" +
                "              <DimensionAllowance>\n" +
                "                <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                <MaxLinear>85.00</MaxLinear>\n" +
                "                <MinLinear>85.00</MinLinear>\n" +
                "              </DimensionAllowance>\n" +
                "            </WeightAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>7.00</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>1</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>115.00</MaxLinear>\n" +
                "                  <MinLinear>115.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>36.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>23.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>56.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Small Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight/>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>85.00</MaxLinear>\n" +
                "                  <MinLinear>85.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>45.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>10.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>30.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "          </CarryOnBag>\n" +
                "          <CarryOnBag refs=\"PAX_LIST_ID_4 PAX_LIST_ID_7\">\n" +
                "            <WeightAllowance>\n" +
                "              <MaximumWeight/>\n" +
                "              <DimensionAllowance>\n" +
                "                <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                <MaxLinear>85.00</MaxLinear>\n" +
                "                <MinLinear>85.00</MinLinear>\n" +
                "              </DimensionAllowance>\n" +
                "            </WeightAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>7.00</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>1</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>115.00</MaxLinear>\n" +
                "                  <MinLinear>115.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>36.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>23.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>56.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Small Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight/>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>85.00</MaxLinear>\n" +
                "                  <MinLinear>85.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>45.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>10.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>30.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "          </CarryOnBag>\n" +
                "        </CarryOnBags>\n" +
                "      </OriginDestination>\n" +
                "      <OriginDestination>\n" +
                "        <DepartureCode>WUH</DepartureCode>\n" +
                "        <ArrivalCode>MEL</ArrivalCode>\n" +
                "        <CheckedBags>\n" +
                "          <CheckedBag refs=\"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\">\n" +
                "            <WeightAllowance/>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>3</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Check-in bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"3\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>50.0</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>3</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>3.00</MaxLinear>\n" +
                "                  <MinLinear>3.00</MinLinear>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <DimensionAllowance/>\n" +
                "            <AllowanceDescription>\n" +
                "              <Descriptions/>\n" +
                "            </AllowanceDescription>\n" +
                "          </CheckedBag>\n" +
                "          <CheckedBag refs=\"PAX_LIST_ID_3\">\n" +
                "            <WeightAllowance/>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>3</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Check-in bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"3\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>50.0</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>3</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>3.00</MaxLinear>\n" +
                "                  <MinLinear>3.00</MinLinear>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <DimensionAllowance/>\n" +
                "            <AllowanceDescription>\n" +
                "              <Descriptions/>\n" +
                "            </AllowanceDescription>\n" +
                "          </CheckedBag>\n" +
                "          <CheckedBag refs=\"PAX_LIST_ID_4 PAX_LIST_ID_7\">\n" +
                "            <WeightAllowance/>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>2</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Check-in bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"2\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>10.0</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>2</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>3.00</MaxLinear>\n" +
                "                  <MinLinear>3.00</MinLinear>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <DimensionAllowance/>\n" +
                "            <AllowanceDescription>\n" +
                "              <Descriptions/>\n" +
                "            </AllowanceDescription>\n" +
                "          </CheckedBag>\n" +
                "        </CheckedBags>\n" +
                "        <CarryOnBags>\n" +
                "          <CarryOnBag refs=\"PAX_LIST_ID_1 PAX_LIST_ID_2 PAX_LIST_ID_5 PAX_LIST_ID_6\">\n" +
                "            <WeightAllowance>\n" +
                "              <MaximumWeight/>\n" +
                "              <DimensionAllowance>\n" +
                "                <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                <MaxLinear>85.00</MaxLinear>\n" +
                "                <MinLinear>85.00</MinLinear>\n" +
                "              </DimensionAllowance>\n" +
                "            </WeightAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>15.00</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>1</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>115.00</MaxLinear>\n" +
                "                  <MinLinear>115.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>36.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>23.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>56.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Small Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight/>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>85.00</MaxLinear>\n" +
                "                  <MinLinear>85.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>45.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>10.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>30.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "          </CarryOnBag>\n" +
                "          <CarryOnBag refs=\"PAX_LIST_ID_3\">\n" +
                "            <WeightAllowance>\n" +
                "              <MaximumWeight/>\n" +
                "              <DimensionAllowance>\n" +
                "                <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                <MaxLinear>85.00</MaxLinear>\n" +
                "                <MinLinear>85.00</MinLinear>\n" +
                "              </DimensionAllowance>\n" +
                "            </WeightAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>15.00</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>1</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>115.00</MaxLinear>\n" +
                "                  <MinLinear>115.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>36.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>23.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>56.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Small Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight/>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>85.00</MaxLinear>\n" +
                "                  <MinLinear>85.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>45.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>10.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>30.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "          </CarryOnBag>\n" +
                "          <CarryOnBag refs=\"PAX_LIST_ID_4 PAX_LIST_ID_7\">\n" +
                "            <WeightAllowance>\n" +
                "              <MaximumWeight/>\n" +
                "              <DimensionAllowance>\n" +
                "                <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                <MaxLinear>85.00</MaxLinear>\n" +
                "                <MinLinear>85.00</MinLinear>\n" +
                "              </DimensionAllowance>\n" +
                "            </WeightAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight>\n" +
                "                    <Value>15.00</Value>\n" +
                "                    <UOM>KG</UOM>\n" +
                "                    <SpreadOverBagsQuantity>1</SpreadOverBagsQuantity>\n" +
                "                  </MaximumWeight>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>115.00</MaxLinear>\n" +
                "                  <MinLinear>115.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>36.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>23.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>56.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "            <PieceAllowance>\n" +
                "              <TotalQuantity>1</TotalQuantity>\n" +
                "              <Descriptions>\n" +
                "                <Description>\n" +
                "                  <Text>Small Carry-on bag</Text>\n" +
                "                </Description>\n" +
                "              </Descriptions>\n" +
                "              <PieceMeasurements Quantity=\"1\">\n" +
                "                <PieceWeightAllowance>\n" +
                "                  <MaximumWeight/>\n" +
                "                </PieceWeightAllowance>\n" +
                "                <PieceDimensionAllowance>\n" +
                "                  <DimensionUOM>Centimeter</DimensionUOM>\n" +
                "                  <MaxLinear>85.00</MaxLinear>\n" +
                "                  <MinLinear>85.00</MinLinear>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Length</Category>\n" +
                "                    <MaxValue>45.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Width</Category>\n" +
                "                    <MaxValue>10.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                  <Dimensions>\n" +
                "                    <Category>Height</Category>\n" +
                "                    <MaxValue>30.00</MaxValue>\n" +
                "                  </Dimensions>\n" +
                "                </PieceDimensionAllowance>\n" +
                "              </PieceMeasurements>\n" +
                "            </PieceAllowance>\n" +
                "          </CarryOnBag>\n" +
                "        </CarryOnBags>\n" +
                "      </OriginDestination>\n" +
                "      <DataLists>\n" +
                "        <MediaList/>\n" +
                "        <PassengerList>\n" +
                "          <Passenger PassengerID=\"PAX_LIST_ID_1\">\n" +
                "            <PTC>ADT</PTC>\n" +
                "          </Passenger>\n" +
                "          <Passenger PassengerID=\"PAX_LIST_ID_2\">\n" +
                "            <PTC>ADT</PTC>\n" +
                "          </Passenger>\n" +
                "          <Passenger PassengerID=\"PAX_LIST_ID_5\">\n" +
                "            <PTC>ADT</PTC>\n" +
                "          </Passenger>\n" +
                "          <Passenger PassengerID=\"PAX_LIST_ID_6\">\n" +
                "            <PTC>ADT</PTC>\n" +
                "          </Passenger>\n" +
                "          <Passenger PassengerID=\"PAX_LIST_ID_3\">\n" +
                "            <PTC>CHD</PTC>\n" +
                "          </Passenger>\n" +
                "          <Passenger PassengerID=\"PAX_LIST_ID_4\">\n" +
                "            <PTC>INF</PTC>\n" +
                "          </Passenger>\n" +
                "          <Passenger PassengerID=\"PAX_LIST_ID_7\">\n" +
                "            <PTC>INF</PTC>\n" +
                "          </Passenger>\n" +
                "        </PassengerList>\n" +
                "      </DataLists>\n" +
                "    </BaggageAllowanceRS>\n" +
                "  </Body>\n" +
                "</Envelope>\n";
        return xmlData;
    }

    /**
     * @Created by yaobin.a.liu
     * @CreateDate: 2/24/2019 5:12 PM
     * @Description : 调用/get/baggage/response，把xml的数据转换为Java bean POJO 的数据如下
     */
    public static String jsonData(){
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
