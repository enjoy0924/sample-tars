package com.altas.erp.eds.entity;

public class AccountAgedTrialBalanceEntityWithBLOBs extends AccountAgedTrialBalanceEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_aged_trial_balance.result_selection
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String resultSelection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_aged_trial_balance.target_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String targetMove;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_aged_trial_balance.result_selection
     *
     * @return the value of account_aged_trial_balance.result_selection
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getResultSelection() {
        return resultSelection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_aged_trial_balance.result_selection
     *
     * @param resultSelection the value for account_aged_trial_balance.result_selection
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setResultSelection(String resultSelection) {
        this.resultSelection = resultSelection == null ? null : resultSelection.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_aged_trial_balance.target_move
     *
     * @return the value of account_aged_trial_balance.target_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getTargetMove() {
        return targetMove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_aged_trial_balance.target_move
     *
     * @param targetMove the value for account_aged_trial_balance.target_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setTargetMove(String targetMove) {
        this.targetMove = targetMove == null ? null : targetMove.trim();
    }
}