# Azure Disk CSI Driver

AKS commonly uses:
- Azure Disk CSI Driver
for:
- persistent storage orchestration.

The driver integrates Kubernetes with:
- Azure managed disk infrastructure.

---

# Why The Driver Matters

Stateful workloads continuously depend on:
- runtime storage provisioning
- attachment
- and recovery operations.

---

# Identity Integration

AKS commonly uses:
- Managed Identities attached to worker nodes.

These identities perform:
- storage API operations directly through Azure APIs.

---

# Runtime Storage Operations

Azure Disk CSI commonly manages:
- provisioning
- attachment
- resizing
- and failover recovery.

---

# Operational Benefits

Managed identities simplify:
- infrastructure permission handling
compared to:
- explicit workload-level federation models.

---

# Platform Engineering Perspective

Azure integrates storage identity more directly into infrastructure compute layers.

---

# Key Insight

Cloud identity architecture strongly influences Kubernetes storage orchestration.
