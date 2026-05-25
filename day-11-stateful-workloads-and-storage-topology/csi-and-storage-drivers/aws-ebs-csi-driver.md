# AWS EBS CSI Driver

Kubernetes requires:
- a CSI driver
to provision and manage:
- AWS EBS volumes.

The EBS CSI Driver enables:
- storage lifecycle orchestration through AWS APIs.

---

# Why The Driver Matters

EBS volumes are:
- availability-zone specific
and:
- physically attached to worker nodes.

Kubernetes therefore requires:
- topology-aware storage management.

---

# Runtime Storage Operations

The EBS CSI Driver commonly performs:
- volume provisioning
- attachment
- detachment
- resizing
- and recovery operations.

---

# Identity Integration

EKS commonly uses:
- OIDC federation
- and IAM Roles for Service Accounts (IRSA)
to grant:
- AWS API permissions securely.

---

# Operational Challenges

Storage operations may fail because of:
- topology mismatch
- attachment delays
- or permission instability.

---

# Platform Engineering Perspective

AWS storage orchestration strongly depends on:
- identity-aware infrastructure integration.

---

# Key Insight

Stateful Kubernetes workloads require cloud-aware storage orchestration.
