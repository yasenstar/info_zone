hour = int(input("Starting time (hours): "))
mins = int(input("Starting time (minutes): "))
dura = int(input("Event duration (minutes): "))

# Write your code here.
if mins + dura >= 60:
    end_mins = mins + dura - 60
    if hour == 23:
        end_hour = 0
    else:
        end_hour = hour + 1
else:
    end_mins = mins + dura
    end_hour = hour

# print("event starts at ", hour, ":", mins, sep="")
print("event starts at ", hour, ":", mins)

print("lasts:", dura, "minutes")

# print("event ends at ", end_hour, ":", end_mins, sep="")
print("event ends at ", end_hour, ":", end_mins)