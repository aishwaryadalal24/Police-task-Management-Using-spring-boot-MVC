# Create figure for plotting
import datetime as dt
import time
import numpy as np
import matplotlib.pyplot as plt
import matplotlib.animation as animation
import random
import csv
from pathlib import Path

fig = plt.figure()
ax = fig.add_subplot(1, 1, 1)
xs=[0]
ys=[0]
#Initialize communication with TMP102
#tmp102.init()

# This function is called periodically from FuncAnimation
def animate(i, xs, ys):
    
    with open('C:\\Users\\Dell\\Documents\\SpringLab\\Police_smart_app\\pyj\\crimes.txt') as csv_file:
        read_csv=csv.reader(csv_file,delimiter=",")
        for row in read_csv:
            if (ys[-1])!=row[-1]:
    # Read temperature (Celsius) from TMP102
                temp_c =row[-1]

    # Add x and y to lists
                xs.append(dt.datetime.now().strftime('%H:%M:%S.%f'))
                ys.append(int(temp_c))

    # Limit x and y lists to 20 items
                xs = xs[-20:]
                ys = ys[-20:]

    # Draw x and y lists
                ax.clear()
                ax.plot(xs, ys)

    # Format plot
                plt.xticks(rotation=45, ha='right')
                plt.subplots_adjust(bottom=0.30)
                plt.title('Crime-Graph on ')
                plt.ylabel('Offence-Rate')
                #flag=0

# Set up plot to call animate() function periodically
#if flag==1:
ani = animation.FuncAnimation(fig, animate, fargs=(xs, ys), interval=1000)
plt.show()
#else:
 #   plt.show