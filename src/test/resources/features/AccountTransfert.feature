Feature: Account transfers
    Scenario: Transferring money between accounts within the bank
        Given Tess has the following accounts:
            | account | balance |
            | current | 1000    |
            | savings | 2000    |
        When she transfers 500.00 from current to savings
        Then her accounts should look like this:
            | account | balance |
            | current | 500     |
            | savings | 2500    |
