print("Enter no of participants : ")
n = int(input())

for i in range(n):
    print("Enter marks1, marks2, marks: ")
    m1 = int(input())
    m2 = int(input())
    m3 = int(input())
    if((m1 + m2 + m3) / 3 >= 70) :
        print("Qualified")
    else:
        print("Not Qualified")