bank package
Készíts egy bankszámlát reprezentáló BankAccount osztályt, amely tartalmazza a számla tulajdonosának nevét (accountName), az egyenleget (balance) és egy egyedi számlaszámot (accountNumber). 1 pont

Valósítsd meg, hogy egy számla létrehozása után a számlatulajdonos neve (és természetesen az egyenlege is) változhasson, ám a számlaszáma nem! 1,5 pont


Az osztálynak meg kell valósítania a számlával kapcsolatos alábbi műveleteket és az osztálynak saját kivételeket kell dobnia helytelen műveletek esetén:

getAccountNumber:: Visszaadja a számlaszámot. 0,5 pont
getAccountName: Visszaadja a számlatulajdonos nevét. 0,5 pont
getBalance: Visszaadja az egyenleget. 0,5 pont
deposit: Befizeti a megadott összeget a számlára. 1 pont
withdraw: Kiveszi a megadott összeget a számláról, ha van elegendő pénz a számlán. 2 pont
transfer: Átutalja a megadott összeget a jelenlegi számláról a cél számlára, ha van elegendő pénz a számlán. 2 pont
isValidAccountNumber: Osztályszintű metódus, mely ellenőrzi, hogy a megadott számlaszám érvényes-e. Azt a számlaszámot tekintjük érvényesnek, ahol a számjegyek összege legalább 20 és az első és az utolsó számjegyének a paritása megegyezik. (Paritás = páros vagy páratlan) Használhatod az Integer.parseInt() metódust! 3 pont

Ügyelj arra, hogy a kért metódusokat valósítsd meg, a paraméterlistákat neked kell kitalálnod!
Plusz pont: helyes paraméterlisták 1 pont

Pontozás: 12 + 1 pont
