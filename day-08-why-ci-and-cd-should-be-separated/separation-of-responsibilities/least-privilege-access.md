# Least Privilege Access

Least privilege is one of the most important:
- security principles in platform engineering.

Every system should only receive:
- the minimum required access.

---

# Why This Matters

Excessive permissions increase:
- operational blast radius.

If compromised systems own:
- unrestricted production access,

then:
- production environments become vulnerable.

---

# CI Pipeline Risks

CI pipelines commonly execute:
- builds
- dependency downloads
- external integrations
- and user-controlled workflows.

Granting production deployment permissions to CI creates:
- unnecessary security exposure.

---

# CD Operational Ownership

CD systems should independently control:
- deployment orchestration
- rollout governance
- and production reconciliation.

This improves:
- operational separation and safety.

---

# Kubernetes Importance

Production clusters should minimize:
- direct mutation access.

This improves:
- operational control
- and deployment traceability.

---

# Key Insight

Production access should remain isolated from build-validation workflows.
