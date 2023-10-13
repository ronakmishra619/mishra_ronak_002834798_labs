/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Ronak Mishra
 */
public class AccountDirectory {
    private ArrayList<Account> accountList;

    // constructor of business class.
    public AccountDirectory() {
        this.accountList = new ArrayList<Account>();
        
    }
    
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account addAccount(){
        Account account = new Account();
        accountList.add(account);
        return account;
    
    }
    
    // Delete method will be void because we dont need it to return anything after delete
    public void deleteAccount(Account account){
        accountList.remove(account);
    }
    
    //Method for searching the account
    public Account searchAccount(String accountNumber){
        for(Account account: accountList){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
    return null;
    }
}