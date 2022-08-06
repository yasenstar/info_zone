from diagrams import Diagram
from diagrams.azure.compute import *
from diagrams.azure.database import *
from diagrams.azure.network import *

with Diagram("basic vm", show=False):
    SQL("yasen-db") >> Firewall("FW") >> [VMLinux("web-server1"), VMLinux("web-server2")]