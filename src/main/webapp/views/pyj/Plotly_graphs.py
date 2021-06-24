import plotly.offline
import plotly.graph_objs as go
from flask import Markup
import numpy as np
import datetime as dt
import csv
xs=[2]
ys=[2]
with open('C:\\Users\\Dell\\Documents\\SpringLab\\Police_smart_app\\src\\main\\webapp\\views\\pyj\\crimes.txt') as csv_file:
    read_csv=csv.reader(csv_file,delimiter=",")
    for row in read_csv:
        if (ys[-1])!=row[-1]:
    # Read temperature (Celsius) from TMP102
            temp_c =row[-1]

    # Add x and y to lists
            xs.append(dt.datetime.now().strftime('%H:%M:%S.%f'))
            ys.append(int(temp_c))

    # Limit x and y lists to 20 items
            xs = xs[-5:]
            ys = ys[-5:]

            to_plot=go.Scatter(x=xs,y=ys)
            data=[to_plot]
            plotly.offline.plot({ "data": data,"layout": go.Layout(title = "Crime-Rate")}, auto_open = True)