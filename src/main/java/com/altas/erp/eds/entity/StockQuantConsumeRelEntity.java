package com.altas.erp.eds.entity;

public class StockQuantConsumeRelEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_quant_consume_rel.consume_quant_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer consumeQuantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_quant_consume_rel.produce_quant_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer produceQuantId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_quant_consume_rel.consume_quant_id
     *
     * @return the value of stock_quant_consume_rel.consume_quant_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getConsumeQuantId() {
        return consumeQuantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_quant_consume_rel.consume_quant_id
     *
     * @param consumeQuantId the value for stock_quant_consume_rel.consume_quant_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setConsumeQuantId(Integer consumeQuantId) {
        this.consumeQuantId = consumeQuantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_quant_consume_rel.produce_quant_id
     *
     * @return the value of stock_quant_consume_rel.produce_quant_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getProduceQuantId() {
        return produceQuantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_quant_consume_rel.produce_quant_id
     *
     * @param produceQuantId the value for stock_quant_consume_rel.produce_quant_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setProduceQuantId(Integer produceQuantId) {
        this.produceQuantId = produceQuantId;
    }
}