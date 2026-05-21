# Why CI And CD Should Be Separated

Continuous Integration and Continuous Delivery operate at:
- different operational layers
- with different trust boundaries.

They should therefore remain:
- operationally separated.

---

# CI Responsibility

CI focuses on:
- validating code
- testing artifacts
- scanning vulnerabilities
- and establishing artifact trust.

CI should not directly:
- mutate production environments.

---

# CD Responsibility

CD focuses on:
- deployment orchestration
- rollout safety
- rollback behavior
- and production control.

This requires:
- stricter operational governance.

---

# Why Separation Matters

Combining both responsibilities creates:
- excessive privilege exposure.

Example:

Git push
→ CI pipeline executes
→ Pipeline owns cluster access
→ Production mutated directly

This increases:
- blast radius dramatically.

---

# Operational Benefits

Separation improves:
- deployment safety
- auditability
- rollback control
- and production governance.

---

# Key Insight

CI validates artifacts.
CD controls deployment state.
