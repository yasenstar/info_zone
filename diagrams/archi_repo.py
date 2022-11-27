from diagrams import Diagram
from diagrams.azure.compute import *
from diagrams.azure.network import *
from diagrams.azure.database import *
from diagrams.azure.web import.*

with Diagram("VG01-MASDCL-A-123608-Dev01-VFSArchiRepo", show=False):
    FunctionApps("Canvas Architecture")
    VMLinux("BackStage App") >> DatabaseForPostgresqlServers("BackStage DB")
    VMWindows("Z123608D01VM1") >> VirtualNetworks("euw-hub03-123608D01-LAZ01-vnet")