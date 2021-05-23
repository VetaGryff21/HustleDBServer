#!/usr/bin/python
# -*- coding: utf-8 -*-

import csv
import re
import pandas as pd

DF = pd.read_csv("dancersCSV.csv", comment='#', sep=';')

DF['club'] = DF['fullname']
a = []
b = []
for tmp in DF['club']:
	x = tmp.split("(", 1)
	x2 = x[1][:-1]
	x3 = x[0].strip()
	a.append(x2)
	b.append(x3)

DF["club"] = a
DF["fullname"] = b

DF.to_csv("dancersCSV2.csv", index=False)