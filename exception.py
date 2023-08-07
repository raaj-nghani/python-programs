balance = 500.00
while True:
	try:
		deposit = float(input("Enter amount to deposite"))
		break
	except ValueError:
		print(f'Please a numeric value')
balance += deposite
print(f'Total Balance is :' {balance})
