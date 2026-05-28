# Spot Vs OnDemand Infrastructure

Distributed platforms commonly deploy:
- a mix of:
  - spot infrastructure
  - and on-demand infrastructure.

This balances:
- survivability
- performance
- and infrastructure economics.

---

# Why Mixed Infrastructure Matters

On-demand infrastructure improves:
- runtime stability
- predictable availability
- and workload continuity.

Spot infrastructure improves:
- cloud cost efficiency.

---

# Runtime Workload Placement

Critical workloads commonly use:
- on-demand infrastructure.

Examples include:
- kube-system components
- Cilium
- Vault
- ArgoCD
- observability stacks
- and stateful workloads.

Interruption-tolerant workloads commonly use:
- spot infrastructure.

---

# Operational Challenges

Improper workload placement may create:
- infrastructure instability
- runtime outages
- and unhealthy failover behavior.

---

# Platform Engineering Perspective

Workload criticality should continuously influence infrastructure economics.

---

# Key Insight

Reliable platforms continuously balance survivability and infrastructure efficiency together.
