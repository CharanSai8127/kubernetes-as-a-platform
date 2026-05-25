# Cloud Storage Identity Models

Cloud providers integrate Kubernetes storage differently.

Storage orchestration commonly depends on:
- cloud identity models
- API permissions
- and infrastructure authorization behavior.

---

# AWS Identity Model

EKS commonly uses:
- OIDC federation
- IAM Roles for Service Accounts
- and trust policies.

This enables:
- workload-level cloud API authorization.

---

# Azure Identity Model

AKS commonly uses:
- Managed Identities attached to worker nodes.

Storage permissions are commonly inherited through:
- infrastructure-level identity integration.

---

# Why Identity Matters

Storage orchestration continuously depends on:
- cloud API access.

Improper permissions may create:
- provisioning failures
- attachment instability
- and recovery delays.

---

# Platform Engineering Perspective

Cloud identity architecture directly impacts:
- runtime storage survivability.

---

# Key Insight

Stateful systems strongly depend on cloud-aware identity orchestration.
