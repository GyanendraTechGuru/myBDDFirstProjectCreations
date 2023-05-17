Feature: MoneyControl

Scenario Outline: LoginMoneyControl 

Given User open web browser

When User enter moneycontrol <URL>

Then User check title of page

Examples:
|URL|
|https://www.moneycontrol.com/|
