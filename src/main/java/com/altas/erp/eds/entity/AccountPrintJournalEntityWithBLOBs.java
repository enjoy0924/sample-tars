package com.altas.erp.eds.entity;

public class AccountPrintJournalEntityWithBLOBs extends AccountPrintJournalEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_print_journal.sort_selection
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String sortSelection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_print_journal.target_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String targetMove;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_print_journal.sort_selection
     *
     * @return the value of account_print_journal.sort_selection
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getSortSelection() {
        return sortSelection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_print_journal.sort_selection
     *
     * @param sortSelection the value for account_print_journal.sort_selection
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setSortSelection(String sortSelection) {
        this.sortSelection = sortSelection == null ? null : sortSelection.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_print_journal.target_move
     *
     * @return the value of account_print_journal.target_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getTargetMove() {
        return targetMove;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_print_journal.target_move
     *
     * @param targetMove the value for account_print_journal.target_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setTargetMove(String targetMove) {
        this.targetMove = targetMove == null ? null : targetMove.trim();
    }
}