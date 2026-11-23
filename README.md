## Did the deposit work for both accounts? Why or why not?
It worked for account1 but not for account2. Because account1 is declared as a BankAccount, which has a deposit method while account2 is declared as a Valuable, and Valuable doesn't have deposit.

## What methods are available for account1?
Everything a BankAccount offers: deposit() and withdraw() from BankAccount, getBalance(), setBalance() and getValue() from Account.

## What methods are available for account2?
Only getValue(), which comes from the Valuable interface. Its deposit() and withdraw() methods exist on the object but can't be called through this Valuable.

## Why?
Java decides which methods you can call from the variable's declared type, not from the type of the object it points to.

![assets-diagrams.png](assets-diagrams.png)